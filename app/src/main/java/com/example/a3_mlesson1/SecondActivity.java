package com.example.a3_mlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        tvName = findViewById(R.id.tv_name);
        String edtName = getIntent().getStringExtra("edtName");
        tvName.setText(edtName);
    }

}