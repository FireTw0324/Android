package com.gss.arxan.test;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    private static final String DETECT_RESULT = "DETECT_RESULT";
    public static TextView OutputScreen;
    private static MyHandler handler;
    public Button btn_go;
    public CheckBox selected_hdg;

    public static void hdgNT() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        setViewById();
        setEffect();
        Log.i("ContentValues", "Test");
    }

    public void setViewById() {
        OutputScreen = (TextView) findViewById(R.id.text_first_OutputScreen);
        this.selected_hdg = (CheckBox) findViewById(R.id.selected_hdg);
        this.btn_go = (Button) findViewById(R.id.btn_go);
    }

    public void setEffect() {
        OutputScreen.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.btn_go.setOnClickListener(new View.OnClickListener() { // from class: com.gss.arxan.test.MainActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainActivity.this.detect();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void detect() {
        final InvocationLocations invocationLocations = new InvocationLocations();
        OutputScreen.setText("");
        new Thread(new Runnable() { // from class: com.gss.arxan.test.MainActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.m30lambda$detect$0$comgssarxantestMainActivity(invocationLocations);
            }
        }).start();
    }

    /* renamed from: lambda$detect$0$com-gss-arxan-test-MainActivity  reason: not valid java name */
    public /* synthetic */ void m30lambda$detect$0$comgssarxantestMainActivity(InvocationLocations invocationLocations) {
        if (this.selected_hdg.isChecked()) {
            invocationLocations.runDetection();
        }
    }

    public static void setOutputScreen(String str) {
        OutputScreen.setText(((Object) OutputScreen.getText()) + str + "\n");
    }

    public static void rvgT() {
        setOutputScreen("[resourceVerification] ... Tamper!");
    }

    public static void ddgT() {
        setOutputScreen("[debuggerDetection] ... Tamper!");
    }

    public static void edgT() {
        setOutputScreen("[emulatorDetection] ... Tamper!");
    }

    public static void rdgT() {
        setOutputScreen("[rootDetection] ... Tamper!");
    }

    public static void hdgT() {
        setOutputScreen("[hookDetection] ... Tamper!");
    }

    public static void fdgT() {
        setOutputScreen("[dynamicInstrumentationDetection] ... Tamper!");
    }

    public static void csgT() {
        setOutputScreen("[checksum] ... Tamper!");
    }

    public static void mpdgT() {
        setOutputScreen("[maliciousPackageDetection] ... Tamper!");
    }

    public static void vdgT() {
        setOutputScreen("[virtualizationDetection] ... Tamper!");
    }

    public static void vcdgT() {
        setOutputScreen("[virtualControlDetection] ... Tamper!");
    }

    public static void scgT() {
        setOutputScreen("[signatureCheck] ... Tamper!");
        Log.d("ContentValues", "scg-Tamper");
        int i = 1 / 0;
    }

    public static void rvgNT() {
        setOutputScreen("[resourceVerification] ... Non-Tamper!");
    }

    public static void ddgNT() {
        setOutputScreen("[debuggerDetection] ... Non-Tamper!");
    }

    public static void edgNT() {
        setOutputScreen("[emulatorDetection] ... Non-Tamper!");
    }

    public static void rdgNT() {
        setOutputScreen("[rootDetection] ... Non-Tamper!");
    }

    public static void fdgNT() {
        setOutputScreen("[dynamicInstrumentationDetection] ... Non-Tamper!");
    }

    public static void csgNT() {
        setOutputScreen("[checksum] ... Non-Tamper!");
    }

    public static void mpdgNT() {
        setOutputScreen("[maliciousPackageDetection] ... Non-Tamper!");
    }

    public static void vdgNT() {
        setOutputScreen("[virtualizationDetection] ... Non-Tamper!");
    }

    public static void vcdgNT() {
        setOutputScreen("[virtualControlDetection] ... Non-Tamper!");
    }

    public static void scgNT() {
        setOutputScreen("[signatureCheck] ... Non-Tamper!");
        Log.d("ContentValues", "scg-non-Tamper");
        int i = 1 / 0;
    }
}