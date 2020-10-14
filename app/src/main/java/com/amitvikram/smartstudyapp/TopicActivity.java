package com.amitvikram.smartstudyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class TopicActivity extends AppCompatActivity {
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        intent = getIntent();
        String category = intent.getStringExtra("category");
        Toast.makeText(this, category, Toast.LENGTH_LONG).show();
    }
}