package com.example.wayne.dentist.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.bean.TestBean;
import com.example.wayne.dentist.util.ImageLoader;
import com.example.wayne.dentist.widget.MediumTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @name 张东
 * @time 2019/8/1315:12
 * @describe
 */
public class Adapter_map extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

   /* private Context mContext;
    private ArrayList<TestBean.DataBean> mList = new ArrayList<>();

    public Adapter_map(Context context) {
        mContext = context;
    }

    public void addList(List<TestBean.DataBean> list) {
        if (list != null) {
            mList.clear();
            mList.addAll(list);
        }
        notifyDataSetChanged();
    }*/

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //View view = LayoutInflater.from(mContext).inflate(R.layout.item_map, null);
        //ViewHolderData holderData = new ViewHolderData(view);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderData extends RecyclerView.ViewHolder {


        public ViewHolderData(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);

        }
    }

}
