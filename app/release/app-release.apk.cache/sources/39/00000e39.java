package com.gss.arxan.test;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MyHandler extends Handler {
    private WeakReference<BaseActivity> reference;

    MyHandler(BaseActivity baseActivity) {
        this.reference = new WeakReference<>(baseActivity);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        BaseActivity baseActivity = this.reference.get();
        if (baseActivity != null) {
            baseActivity.setResult(message);
        }
    }
}