package com.example.wayne.dentist.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.wayne.dentist.widget.LoadingDialog;

import butterknife.ButterKnife;


/**
 * @name 张东
 * @time 2019/8/114:29
 */
public abstract class BaseActivity<V extends BaseView , P extends BasePre> extends AppCompatActivity implements BaseView {
    public P mPresenter;
    private LoadingDialog mLoadingDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( getId() );
        ButterKnife.bind( this );      //activity  不需要解绑
        mPresenter = getPresenter();
        if (mPresenter != null) {
            mPresenter.BindView( (V) this );                  //其实 this就可以了
        }
        initView();
        initData();
    }

    protected abstract P getPresenter();


    public void initView() {

    }

    public void initData() {

    }

    protected abstract int getId();

    @Override
    public void showLoading() {
        if (mLoadingDialog == null) {
            mLoadingDialog = new LoadingDialog( this );
        }
        mLoadingDialog.show();
    }

    @Override
    public void hideLoading() {
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //打断关系 p.v
        if (mPresenter != null)
            mPresenter.OnDestory();    //销毁   MVP 对象   清空线程
        mPresenter = null;
    }
}
