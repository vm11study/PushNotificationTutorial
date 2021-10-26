package com.example.pushnotificationtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "FirebaseMessagingServic";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "enter MainActivity.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}