package com.example.wayne.dentist.mvp.encyclopedia;


import com.example.wayne.dentist.base.BasePre;
import com.example.wayne.dentist.bean.TabBean;
import com.example.wayne.dentist.mvp.collback.CallBack;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public class EncyPre extends BasePre<EncyView> {

    private EncyModel mModel;

    @Override
    protected void initModel() {
        mModel = new EncyModel();
        mModels.add(mModel);
    }

    //tab数据
    public void getList(int ID, int Pid) {

        mModel.getTab(ID, Pid, new CallBack<TabBean>() {
            @Override
            public void onSucceed(TabBean bean) {
                if (mView != null) {
                    mView.tabData(bean);
                }
            }

            @Override
            public void onFailr(String msg) {
                if (mView != null) {
                    mView.Error(msg);
                }
            }
        });

    }

}
