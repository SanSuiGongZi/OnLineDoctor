package com.example.wayne.dentist.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @name 张东
 * @time wayne2019/8/2
 * @describe pingfang简 -- 常规
 */
@SuppressLint("AppCompatCustomView")
public class RoutineTextView extends TextView {

    public RoutineTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //重写设置字体方法
    @Override
    public void setTypeface(Typeface tf) {
        tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/PingFangSCRegular.ttf");
        super.setTypeface(tf);
    }

}
