package com.amitvikram.smartstudyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class UpdateActivity extends AppCompatActivity {
    private TextInputEditText txtName, txtPhone, txtEmail;
    private static String URL_REGIST = "http://smartstudyapp.000webhostapp.com/register.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        txtName = findViewById(R.id.editText_name);
        txtPhone = findViewById(R.id.editText_phone);
        txtEmail = findViewById(R.id.editText_email);
        Intent intent = getIntent();
        txtName.setText(intent.getStringExtra("name"));
        txtEmail.setText(intent.getStringExtra("email"));
        txtPhone.setText(intent.getStringExtra("phone"));
    }


}