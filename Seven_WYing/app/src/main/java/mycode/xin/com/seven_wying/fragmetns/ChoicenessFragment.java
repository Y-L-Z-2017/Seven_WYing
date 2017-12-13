package mycode.xin.com.seven_wying.fragmetns;

import android.view.View;

import mycode.xin.com.seven_wying.R;
import mycode.xin.com.seven_wying.base.BaseFragment;
import mycode.xin.com.seven_wying.mvp.choiceness.ChoicenessPresenter;
import mycode.xin.com.seven_wying.mvp.choiceness.ChoicenessView;

/**
 * date:2017/12/12  22:45
 * author:Mr.XIn💕
 */


public class ChoicenessFragment extends BaseFragment<ChoicenessView,ChoicenessPresenter>{


    @Override
    protected int setLayout() {
        return R.layout.fragment_choiceness;
    }

    @Override
    protected void bridge() {
    }

    @Override
    protected ChoicenessPresenter getPresenter() {
        return null;
    }

    @Override
    protected void initView(View mview) {

    }

    @Override
    protected void logic() {

    }
}
