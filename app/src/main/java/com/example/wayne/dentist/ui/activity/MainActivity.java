package com.example.wayne.dentist.ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.base.BaseApp;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.base.Constants;
import com.example.wayne.dentist.mvp.main.MainPre;
import com.example.wayne.dentist.mvp.main.MainView;
import com.example.wayne.dentist.ui.fragment.Encyclopedia;
import com.example.wayne.dentist.ui.fragment.Inquiry;
import com.example.wayne.dentist.ui.fragment.Mine;
import com.example.wayne.dentist.ui.fragment.Record;
import com.example.wayne.dentist.util.ImageLoader;
import com.example.wayne.dentist.util.SpUtil;
import com.jaeger.library.StatusBarUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.wayne.dentist.util.UIUtils.getContext;

public class MainActivity extends BaseActivity<MainView, MainPre> implements MainView {

    @BindView(R.id.tv_tv)
    TextView tvTv;
    @BindView(R.id.mIv_photo)
    ImageView mIvPhoto;
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.fl_layout)
    FrameLayout flLayout;
    @BindView(R.id.imageview)
    ImageView imageview;

    //ToolBar中需要显示隐藏的控件
    @BindView(R.id.mSearch)
    SearchView mSearch;
    @BindView(R.id.mRl_Toll)
    RelativeLayout mRlToll;
    @BindView(R.id.mTab)
    TabLayout mTab;

    private FragmentManager manager;
    private ArrayList<BaseFragment> mList;
    private final int ENCYCLOPEDIA = 0;
    private final int INQUIRY = 1;
    private final int RECORD = 2;
    private final int MINE = 3;
    private int previouslyPage = 0;

    @Override
    protected MainPre getPresenter() {
        return new MainPre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        //绑定toolbar
        mTool.setTitle("");
        setSupportActionBar(mTool);
        StatusBarUtil.setLightMode(this);

       /* //设置搜索框
        //设置提示内容
        SpannableString spanText = new SpannableString("哪里不舒服或者想了解什么知识,请简短输入");
        //设置字体大小
        spanText.setSpan(new AbsoluteSizeSpan(20,true),0,spanText.length(),Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        //设置字体颜色
        spanText.setSpan(new ForegroundColorSpan(Color.BLACK),0,spanText.length(),Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        mSearch.setQueryHint(spanText);*/

        manager = getSupportFragmentManager();

        mList = new ArrayList<>();
        mList.add(new Encyclopedia());
        mList.add(new Inquiry());
        mList.add(new Record());
        mList.add(new Mine());

        mTab.addTab(mTab.newTab().setText(R.string.cyclopedia).setIcon(R.drawable.ency_selector));
        mTab.addTab(mTab.newTab().setText(R.string.inquary).setIcon(R.mipmap.inquiry_no));
        mTab.addTab(mTab.newTab().setText(R.string.file).setIcon(R.mipmap.record_no));
        mTab.addTab(mTab.newTab().setText(R.string.me).setIcon(R.mipmap.me_no));

        mTab.getTabAt(0).setCustomView(getTabView(BaseApp.getRes().getString(R.string.cyclopedia), R.drawable.ency_selector));
        mTab.getTabAt(1).setCustomView(getTabView(BaseApp.getRes().getString(R.string.inquary), R.mipmap.inquiry_no));
        mTab.getTabAt(2).setCustomView(getTabView(BaseApp.getRes().getString(R.string.file), R.mipmap.record_no));
        mTab.getTabAt(3).setCustomView(getTabView(BaseApp.getRes().getString(R.string.me), R.mipmap.me_no));

        initAddHomeFrag();

        mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        switchFragments(ENCYCLOPEDIA);
                        break;
                    case 1:
                        switchFragments(INQUIRY);
                        break;
                    case 2:
                        switchFragments(RECORD);
                        break;
                    case 3:
                        String param = (String) SpUtil.getParam(Constants.TOKEN, "");
                        if (!param.isEmpty()) {
                            switchFragments(MINE);
                        } else {
                            startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        }
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void initAddHomeFrag() {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fl_layout, mList.get(0));
        transaction.commit();
    }

    @OnClick({R.id.mIv_photo, R.id.imageview})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mIv_photo:
                break;
            case R.id.imageview:
                break;
        }
    }

    private void switchFragments(int page) {
        //获取需要显示的碎片
        Fragment fragment = mList.get(page);
        //获取需要隐藏的碎片
        Fragment fragment1 = mList.get(previouslyPage);
        FragmentTransaction transaction = manager.beginTransaction();
        if (!fragment.isAdded()) {
            transaction.add(R.id.fl_layout, fragment);
        }

        if (page == previouslyPage) {
            transaction.show(fragment);
        } else {
            transaction.show(fragment);
            transaction.hide(fragment1);
        }
        transaction.commit();
        previouslyPage = page;

    }

    // Tab自定义view
    public View getTabView(String title, int image_src) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.main_tabview, null);
        TextView textView = (TextView) v.findViewById(R.id.tv_tab);
        textView.setText(title);
        ImageView imageView = (ImageView) v.findViewById(R.id.iv_tab);
        imageView.setImageResource(image_src);
        return v;
    }


    // 用来计算返回键的点击间隔时间
    private long exitTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                //弹出提示，可以有多种方式
                Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                finish();
            }
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    /**
     * 按回退键会调用这个方法
     */
    /*@Override
    public void onBackPressed() {
        showExitDialog();
    }

    private void showExitDialog() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this);
        builder.setTitle("提示");
        builder.setMessage("确定退出在线医生吗");
        builder.setNegativeButton("取消", null);
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.show();
    }*/

}
