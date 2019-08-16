package com.example.wayne.dentist.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;


import com.example.wayne.dentist.R;



/**
 * @author xts
 *         Created by asus on 2019/4/29.
 */
//网络加载动画
public class
LoadingDialog extends Dialog {
    public LoadingDialog(@NonNull Context context) {
        //loading想要透明,需要加个样式
        super(context, R.style.LoadingTheme);
    }

    public LoadingDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected LoadingDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置dialog视图
        setContentView(R.layout.loading_dialog);
    }
}