package com.gss.arxan.test;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

public class MyHandler extends Handler {

    private WeakReference<BaseActivity> reference;

    MyHandler(BaseActivity fragment) {
        reference = new WeakReference<>(fragment);
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        BaseActivity fragment = reference.get();
        if (fragment != null) {
            fragment.setResult(msg);
        }
    }

}
