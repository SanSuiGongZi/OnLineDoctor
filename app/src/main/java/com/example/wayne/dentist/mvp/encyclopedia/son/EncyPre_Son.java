package com.example.wayne.dentist.mvp.encyclopedia.son;


import com.example.wayne.dentist.base.BasePre;
import com.example.wayne.dentist.bean.TabBean;
import com.example.wayne.dentist.bean.TabSonBean;
import com.example.wayne.dentist.bean.TestBean;
import com.example.wayne.dentist.mvp.collback.CallBack;
import com.example.wayne.dentist.mvp.encyclopedia.EncyView;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public class EncyPre_Son extends BasePre<EncyView_Son> {

    private EncyModel_Son mSon;

    @Override
    protected void initModel() {
        mSon = new EncyModel_Son();
        mModels.add(mSon);
    }

    //tab数据
    public void getList(int ID, int Pid) {

        mSon.getTab(ID, Pid, new CallBack<TabSonBean>() {
            @Override
            public void onSucceed(TabSonBean bean) {
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

    /**
     * 测试接口
     *
     * @param id
     */
    public void getTest(int id) {
        mSon.getList(id, new CallBack<TestBean>() {
            @Override
            public void onSucceed(TestBean bean) {
                if (mView != null) {
                    mView.RvData(bean);
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
