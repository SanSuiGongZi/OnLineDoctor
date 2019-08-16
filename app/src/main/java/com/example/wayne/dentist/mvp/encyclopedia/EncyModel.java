package com.example.wayne.dentist.mvp.encyclopedia;


import com.example.wayne.dentist.base.BaseModel;
import com.example.wayne.dentist.base.BaseObserver;
import com.example.wayne.dentist.base.UrlPort;
import com.example.wayne.dentist.bean.TabBean;
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
public class EncyModel extends BaseModel {

    //tab 数据
    public void getTab(int loginID , int Pid , final CallBack<TabBean> mCallBack) {
        UrlPort urlPort = HttpUtils.getInstance().getApiserver(UrlPort.Url, UrlPort.class);
        Observable<TabBean> list = urlPort.getTabList(loginID, UrlPort.token , Pid);
        list.compose(RxUtils.<TabBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<TabBean>() {
                    @Override
                    public void onNext(TabBean tabBean) {
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



}
