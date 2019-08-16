package com.example.wayne.dentist.ui.fragment;


import android.support.v4.app.Fragment;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseFragment;
import com.example.wayne.dentist.mvp.inquiry.InquiryPre;
import com.example.wayne.dentist.mvp.inquiry.InquiryView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Inquiry extends BaseFragment<InquiryView,InquiryPre> implements InquiryView {


    public Inquiry() {
        // Required empty public constructor
    }

    @Override
    protected InquiryPre GetPresenter() {
        return new InquiryPre();
    }

    @Override
    protected int GetId() {
        return R.layout.fragment_inquiry;
    }

}
