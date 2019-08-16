package com.example.wayne.dentist.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.mvp.record.RecordPre;
import com.example.wayne.dentist.mvp.record.RecordView;
import com.example.wayne.dentist.util.ImageLoader;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class Record extends BaseFragment<RecordView, RecordPre> implements RecordView {


    @BindView(R.id.mIv_Tooth)
    ImageView mIvTooth;
    @BindView(R.id.mIv_Result)
    ImageView mIvResult;

    public Record() {
        // Required empty public constructor
    }

    @Override
    protected RecordPre GetPresenter() {
        return new RecordPre();
    }

    @Override
    protected int GetId() {
        return R.layout.fragment_record;
    }

    @Override
    protected void initView() {
    }
}
