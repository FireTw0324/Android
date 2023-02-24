package com.gss.arxan.test;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public CheckBox selected_hdg;

    public Button btn_go;
    public static TextView OutputScreen;
    private static final String DETECT_RESULT = "DETECT_RESULT";
    private static MyHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViewById();
        setEffect();
        Log.i(TAG, "Test");
//        Log.i(TAG, "TestNON");
    }

    public void setViewById() {
        OutputScreen = findViewById(R.id.text_first_OutputScreen);
        selected_hdg = findViewById(R.id.selected_hdg);
        btn_go = findViewById(R.id.btn_go);
    }

    public void setEffect() {

        // 顯示捲軸
        OutputScreen.setMovementMethod(ScrollingMovementMethod.getInstance());

        // 按鈕事件
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detect();
            }
        });

    }

    //執行動態偵測
    private void detect() {

        InvocationLocations ILs = new InvocationLocations();

        OutputScreen.setText("");

        new Thread(() -> {

            if (selected_hdg.isChecked()) { ILs.runDetection(); }

        }).start();

    }

    //顯示動態偵測結果
    public static void setOutputScreen(String result) {
        String message = OutputScreen.getText() + result + "\n";
        OutputScreen.setText(message);
    }

//    synchronized protected static void sendResult(String result) {
//        Bundle bundle = new Bundle();
//        bundle.putString(DETECT_RESULT, result);
//        Message msg = handler.obtainMessage();
//        msg.setData(bundle);
//        msg.sendToTarget();
//    }

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
        Log.d(TAG, "scg-Tamper");
        int i=1/0;
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

    public static void hdgNT() {
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
        Log.d(TAG, "scg-non-Tamper");
        int i=1/0;
    }

}