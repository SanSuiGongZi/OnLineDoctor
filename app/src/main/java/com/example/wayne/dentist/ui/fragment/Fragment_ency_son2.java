package com.example.wayne.dentist.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.mvp.encyclopedia.son2.EncyPre_Son2;
import com.example.wayne.dentist.mvp.encyclopedia.son2.EncyView_Son2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_ency_son2 extends BaseFragment<EncyView_Son2, EncyPre_Son2> implements EncyView_Son2 {


    @BindView(R.id.mRv)
    RecyclerView mRv;

    public Fragment_ency_son2() {
        // Required empty public constructor
    }

    @Override
    protected EncyPre_Son2 GetPresenter() {
        return new EncyPre_Son2();
    }

    @Override
    protected int GetId() {
        return R.layout.fragment__ency_son2;
    }

}
