package com.example.wayne.dentist.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.wayne.dentist.widget.LoadingDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @name 张东
 * @time 2019/8/114:29
 */
public abstract class BaseFragment<V extends BaseView, P extends BasePre> extends Fragment implements BaseView {

    public P mPresenter;
    private LoadingDialog mLoadingDialog;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(GetId(), container, false);
        mUnbinder = ButterKnife.bind(this, inflate);
        mPresenter = GetPresenter();
        if (mPresenter != null) {
            mPresenter.BindView((V) this);
        }
        initView();
        initData();
        initListener();
        return inflate;
    }

    protected void initListener() {
    }

    protected void initData() {
    }

    protected void initView() {
    }

    protected abstract P GetPresenter();

    protected abstract int GetId();

    @Override
    public void showLoading() {
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }
    }

    @Override
    public void hideLoading() {
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
        if (mPresenter != null) {
            mPresenter.OnDestory();
        }
        mPresenter = null;
    }
}
