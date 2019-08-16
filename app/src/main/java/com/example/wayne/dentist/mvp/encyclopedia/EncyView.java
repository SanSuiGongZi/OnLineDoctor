package com.example.wayne.dentist.mvp.encyclopedia;


import com.example.wayne.dentist.base.BaseView;
import com.example.wayne.dentist.bean.TabBean;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe
 */
public interface EncyView extends BaseView {

    void tabData(TabBean tabBean);
    void Error(String msg);

}
