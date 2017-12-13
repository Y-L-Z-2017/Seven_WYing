package mycode.xin.com.seven_wying.fragmetns;

import android.view.View;

import mycode.xin.com.seven_wying.R;
import mycode.xin.com.seven_wying.base.BaseFragment;
import mycode.xin.com.seven_wying.mvp.special.SpecialPresenter;
import mycode.xin.com.seven_wying.mvp.special.SpecialView;

/**
 * date:2017/12/12  23:34
 * author:Mr.XIn💕
 */


public class SpecialFragment extends BaseFragment<SpecialView,SpecialPresenter> {
    @Override
    protected int setLayout() {
        return R.layout.fragment_special;
    }

    @Override
    protected void bridge() {

    }

    @Override
    protected SpecialPresenter getPresenter() {
        return null;
    }

    @Override
    protected void initView(View mview) {

    }

    @Override
    protected void logic() {

    }
}
