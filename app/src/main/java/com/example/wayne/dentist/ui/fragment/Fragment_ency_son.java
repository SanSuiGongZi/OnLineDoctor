package com.example.wayne.dentist.ui.fragment;


import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.bean.TabSonBean;
import com.example.wayne.dentist.bean.TestBean;
import com.example.wayne.dentist.mvp.encyclopedia.son.EncyPre_Son;
import com.example.wayne.dentist.mvp.encyclopedia.son.EncyView_Son;
import com.example.wayne.dentist.ui.adapter.Adapter_srl;
import com.example.wayne.dentist.ui.adapter.MyAdapter_Vp;
import com.example.wayne.dentist.util.ToastUtil;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_ency_son extends BaseFragment<EncyView_Son, EncyPre_Son> implements EncyView_Son {

    @BindView(R.id.mTab)
    TabLayout mTab;
    @BindView(R.id.mVp)
    ViewPager mVp;
    @BindView(R.id.mRv)
    RecyclerView mRv;
    @BindView(R.id.mSrl)
    SmartRefreshLayout mSrl;
    private ArrayList<Integer> mIcon;
    private int Pid;
    private int mTSortID = 1;
    private int page;
    private Adapter_srl mAdapterSrl;

    public Fragment_ency_son() {
        // Required empty public constructor
    }


    public void setTab(int str, int tSortID) {
        Pid = str;
        mTSortID = tSortID;
    }

    @Override
    protected EncyPre_Son GetPresenter() {
        return new EncyPre_Son();
    }

    @Override
    protected int GetId() {
        return R.layout.fragment_ency_son;
    }

    @Override
    protected void initData() {
        mPresenter.getList(1, Pid);
        mPresenter.getTest(1);  //此为测试的数据
    }

    @Override
    protected void initView() {
        mRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapterSrl = new Adapter_srl(getActivity());
        mRv.setAdapter(mAdapterSrl);

        mIcon = new ArrayList<>();

        if (mTSortID == 1) {
            mIcon.add(R.drawable.selector_structure);
            mIcon.add(R.drawable.selector_upgrowth);
            mIcon.add(R.drawable.selector_teeth_clean);
            mIcon.add(R.drawable.selector_habit);
            mIcon.add(R.drawable.selector_goto_a_doctor);
        } else if (mTSortID == 2) {
            mIcon.add(R.drawable.selector_examination);
            mIcon.add(R.drawable.selector_periodontal);
            mIcon.add(R.drawable.selector_toothl);
            mIcon.add(R.drawable.selector_orthodontics);
            mIcon.add(R.drawable.selector_therapies);

        } else if (mTSortID == 3) {
            mIcon.add(R.drawable.selector_weekly);
            mIcon.add(R.drawable.selector_small_coup);
            mIcon.add(R.drawable.selector_laboratory);
            mIcon.add(R.drawable.selector_misunderstanding);
            mIcon.add(R.drawable.selector_famous_doctors);
        }

    }

    @Override
    public void tabData(TabSonBean tabSonBean) {
        final List<TabSonBean.DataBean> list = tabSonBean.getData();

        if (Pid != 115) {
            mTab.setVisibility(GridView.VISIBLE);
            for (int i = 0; i < list.size(); i++) {
                mTab.addTab(mTab.newTab().setText(list.get(i).getTName()).setIcon(mIcon.get(i)));
                mTab.getTabAt(i).setCustomView(getTabView(list.get(i).getTName(), mIcon.get(i), i));
            }
        } else {
            mTab.setVisibility(GridView.GONE);
            mVp.setVisibility(GridView.GONE);
            mRv.setVisibility(GridView.VISIBLE);
        }

        FragmentManager fm = getChildFragmentManager();
        MyAdapter_Vp myAdapter_vp = new MyAdapter_Vp(fm);
        mVp.setAdapter(myAdapter_vp);

        mVp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTab));
        mTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mVp.setCurrentItem(tab.getPosition());
                //调用接口
                int tabID = list.get(tab.getPosition()).getId();


                changeTabSelect(tab);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                changeTabNormal(tab);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void RvData(final TestBean textBean) {

        mAdapterSrl.addList(textBean.getData());
        mSrl.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                page = 1;
                mAdapterSrl.addList(textBean.getData());
                mSrl.finishRefresh();
            }
        });
        mSrl.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                page++;
                mAdapterSrl.addList(textBean.getData());
                mSrl.finishLoadMore();
            }
        });

    }

    @Override
    public void Error(String msg) {
        ToastUtil.showShort(msg);
    }

    // Tab自定义view
    public View getTabView(String title, int image_src, int location) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.tab_item_view, null);
        TextView textView = (TextView) v.findViewById(R.id.textview);
        textView.setText(title);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageview);
        imageView.setImageResource(image_src);
        if (location == 0) {
            textView.setTextColor(getResources().getColor(R.color.c_2ABFFF));
        } else {
            textView.setTextColor(getResources().getColor(R.color.c_9B9B9B));
        }
        return v;
    }

    // 切换颜色
    private void changeTabSelect(TabLayout.Tab tab) {
        View view = tab.getCustomView();
        TextView mTv = view.findViewById(R.id.textview);
        mTv.setTextColor(getResources().getColor(R.color.c_2ABFFF));
    }

    private void changeTabNormal(TabLayout.Tab tab) {
        View view = tab.getCustomView();
        TextView mTv = view.findViewById(R.id.textview);
        mTv.setTextColor(getResources().getColor(R.color.c_9B9B9B));
    }

}
