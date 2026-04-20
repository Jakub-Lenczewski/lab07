package com.example.lab07;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    public void powrot(View view) {
        finish();
    }
}