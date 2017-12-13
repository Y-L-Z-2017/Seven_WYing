package mycode.xin.com.seven_wying.mvp.mine;

import javax.inject.Inject;

import mycode.xin.com.seven_wying.base.BasePresenter;
import mycode.xin.com.seven_wying.mvp.choiceness.ChoicenessModel;
import mycode.xin.com.seven_wying.mvp.choiceness.ChoicenessView;

/**
 * date:2017/12/12  22:45
 * author:Mr.XIn💕
 */


public class MinePresenter extends BasePresenter<MineView> {
    @Inject
    ChoicenessModel mChoicenessModel;
    @Inject
    public MinePresenter() {
    }
}
