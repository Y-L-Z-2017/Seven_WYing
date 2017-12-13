package mycode.xin.com.seven_wying.fragmetns;

import android.view.View;

import mycode.xin.com.seven_wying.R;
import mycode.xin.com.seven_wying.base.BaseFragment;
import mycode.xin.com.seven_wying.mvp.mine.MinePresenter;
import mycode.xin.com.seven_wying.mvp.mine.MineView;

/**
 * date:2017/12/12  23:34
 * author:Mr.XIn💕
 */


public class MineFragment extends BaseFragment<MineView,MinePresenter> {
    @Override
    protected int setLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void bridge() {

    }

    @Override
    protected MinePresenter getPresenter() {
        return null;
    }

    @Override
    protected void initView(View mview) {

    }

    @Override
    protected void logic() {

    }
}
