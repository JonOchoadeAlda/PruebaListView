package com.example.jon.pruebalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_main);
    }
}
