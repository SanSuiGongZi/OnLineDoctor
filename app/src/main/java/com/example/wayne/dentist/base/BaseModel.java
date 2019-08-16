package com.example.wayne.dentist.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * @name 张东
 * @time 2019/8/114:30
 */
public class BaseModel {

    public CompositeDisposable compositeDisposable;

    public void onDestory() {
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    public void addDisposable(Disposable disposable) {
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
        compositeDisposable.add(disposable);
    }
}
