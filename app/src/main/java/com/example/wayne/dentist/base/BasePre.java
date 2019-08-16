package com.example.wayne.dentist.base;

import java.util.ArrayList;

/**
 * @name 张东
 * @time 2019/8/116:22
 */
public abstract class BasePre<V extends BaseView> {

    public V mView;

    public ArrayList<BaseModel> mModels = new ArrayList<>();

    public void BindView(V view) {
        this.mView = view;
    }

    public BasePre() {
        initModel();
    }

    protected abstract void initModel();

    public void OnDestory() {
        mView = null;
        if (mModels.size() > 0){
            for (BaseModel model : mModels){
                model.onDestory();
            }
            mModels.clear();
        }
    }

}
