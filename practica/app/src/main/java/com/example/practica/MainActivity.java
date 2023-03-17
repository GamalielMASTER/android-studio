package com.example.practica;

import static androidx.core.app.NotificationCompat.getVisibility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (TextView) findViewById(R.id.a);

        findViewById(R.id.b_1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.b_1:
                a.setVisibility(View.VISIBLE);
        }
    }