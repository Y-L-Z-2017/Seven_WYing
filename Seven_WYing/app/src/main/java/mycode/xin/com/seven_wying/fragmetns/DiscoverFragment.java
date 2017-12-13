package mycode.xin.com.seven_wying.fragmetns;

import android.view.View;

import mycode.xin.com.seven_wying.R;
import mycode.xin.com.seven_wying.base.BaseFragment;
import mycode.xin.com.seven_wying.mvp.discover.DiscoverPresenter;
import mycode.xin.com.seven_wying.mvp.discover.DiscoverView;

/**
 * date:2017/12/13  0:01
 * author:Mr.XIn💕
 */


public class DiscoverFragment extends BaseFragment<DiscoverView,DiscoverPresenter> {

    @Override
    protected int setLayout() {
        return R.layout.fragment_discover;
    }

    @Override
    protected void bridge() {

    }

    @Override
    protected DiscoverPresenter getPresenter() {
        return null;
    }

    @Override
    protected void initView(View mview) {

    }

    @Override
    protected void logic() {

    }
}
