package mycode.xin.com.seven_wying.base;

import android.support.v7.widget.ViewUtils;
import android.view.View;

import java.lang.ref.WeakReference;
import java.util.IllegalFormatCodePointException;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * date:2017/12/12  20:33
 * author:Mr.XIn💕
 */


public abstract class BasePresenter<V> {
    private WeakReference<V> mWeakReference;
    private CompositeDisposable mCompositeDisposable;

    //判断是否关联
    public boolean isAttch() {
        return mWeakReference != null && mWeakReference.get() != null ? true : false;
    }
    public void attch(V view){
        if (mWeakReference==null){
            mWeakReference = new WeakReference<V>((V) view);
        }
    }

    //得到V
    public V getView() {
        if (isAttch()) {
            return mWeakReference.get();
        }
        return null;
    }

    public void disAttch() {
        if (isAttch()) {
            remove();
            mWeakReference.clear();
            mWeakReference = null;
        }
    }


    public void add(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    public void remove() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.dispose();
        }


    }

}
