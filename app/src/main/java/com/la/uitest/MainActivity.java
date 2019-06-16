package com.la.uitest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends Activity {
    String TAG = MainActivity.class.getSimpleName();
    FrameLayout mMainLayout;
    RadiusVariationView mRadiusView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "<onCreate>Runing...");

        mRadiusView = new RadiusVariationView(this);
        mRadiusView = findViewById(R.id.rv);



        mMainLayout = findViewById(R.id.rootlayout);
    }
}
