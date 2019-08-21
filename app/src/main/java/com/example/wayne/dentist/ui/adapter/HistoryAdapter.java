package com.example.wayne.dentist.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.wayne.dentist.R;
import com.example.wayne.dentist.bean.HistoryBean;

import java.util.ArrayList;

/**
 * @name 张东
 * @time 2019/8/19  15:10
 * @describe
 */
public class HistoryAdapter extends BaseAdapter {

    private ArrayList<HistoryBean> mList;
    private Context mContext;

    public HistoryAdapter(ArrayList<HistoryBean> list, Context context) {
        mList = list;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View inflate = LayoutInflater.from(mContext).inflate(R.layout.list_view, parent, false);

        final TextView mTv = inflate.findViewById(R.id.mTv_History);
        mTv.setText(mList.get(mList.size()-position-1).getHistory());

        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnClicks!=null){
                    mOnClicks.onClickItem(mTv.getText().toString());
                }
            }
        });

        return inflate;
    }

    private onClicks mOnClicks;

    public void setOnClicks(onClicks onClicks) {
        mOnClicks = onClicks;
    }

    public interface onClicks{
        void onClickItem(String name);
    }

}
