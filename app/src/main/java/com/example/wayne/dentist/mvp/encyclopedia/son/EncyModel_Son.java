package com.example.wayne.dentist.mvp.encyclopedia.son;


import com.example.wayne.dentist.base.BaseModel;
import com.example.wayne.dentist.base.BaseObserver;
import com.example.wayne.dentist.base.UrlPort;
import com.example.wayne.dentist.bean.TabBean;
import com.example.wayne.dentist.bean.TabSonBean;
import com.example.wayne.dentist.bean.TestBean;
import com.example.wayne.dentist.mvp.collback.CallBack;
import com.example.wayne.dentist.util.HttpUtils;
import com.example.wayne.dentist.util.RxUtils;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public class EncyModel_Son extends BaseModel {

    //tab 数据
    public void getTab(int loginID, int Pid, final CallBack<TabSonBean> mCallBack) {
        UrlPort urlPort = HttpUtils.getInstance().getApiserver(UrlPort.Url, UrlPort.class);
        Observable<TabSonBean> list = urlPort.getTabSonList(loginID, UrlPort.token, Pid);
        list.compose(RxUtils.<TabSonBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<TabSonBean>() {
                    @Override
                    public void onNext(TabSonBean tabBean) {
                        mCallBack.onSucceed(tabBean);
                    }

                    @Override
                    public void error(String msg) {
                        mCallBack.onFailr(msg);
                    }

                    @Override
                    protected void subscribe(Disposable d) {
                        addDisposable(d);
                    }
                });
    }

    /**
     * 测试数据
     *
     * @param loginID
     * @param mCallBack
     */
    public void getList(int loginID, final CallBack<TestBean> mCallBack) {
        UrlPort urlPort = HttpUtils.getInstance().getApiserver(UrlPort.Url, UrlPort.class);
        Observable<TestBean> data = urlPort.getEncyData(loginID, UrlPort.token, 0);
        data.compose(RxUtils.<TestBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<TestBean>() {
                    @Override
                    public void onNext(TestBean testBean) {
                        mCallBack.onSucceed(testBean);
                    }

                    @Override
                    public void error(String msg) {
                        mCallBack.onFailr(msg);
                    }

                    @Override
                    protected void subscribe(Disposable d) {
                        addDisposable(d);
                    }
                });
    }

}
