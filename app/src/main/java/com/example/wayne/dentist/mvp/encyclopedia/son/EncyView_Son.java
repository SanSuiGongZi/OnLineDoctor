package com.example.wayne.dentist.mvp.encyclopedia.son;

import com.example.wayne.dentist.base.BaseView;
import com.example.wayne.dentist.bean.TabBean;
import com.example.wayne.dentist.bean.TabSonBean;
import com.example.wayne.dentist.bean.TestBean;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public interface EncyView_Son extends BaseView {

    void tabData(TabSonBean tabSonBean);
    void RvData(TestBean textBean);
    void Error(String msg);

}
