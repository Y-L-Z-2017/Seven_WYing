package mycode.xin.com.seven_wying.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.lang.ref.WeakReference;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * date:2017/12/12  20:33
 * author:Mr.XIn💕
 */
public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {
    T presenter;
    private Unbinder bind;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        bridge();
        presenter = getPresenter();
        bind = ButterKnife.bind(this);
        if (presenter != null) {
            presenter.attch((V) this);
        }
        initView();
        logic();
    }


    abstract int setLayout();

    abstract void bridge();

    abstract T getPresenter();

    abstract void initView();

    abstract void logic();

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.disAttch();
        bind.unbind();
    }
}

