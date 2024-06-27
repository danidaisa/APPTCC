package com.example.apptcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button confirmfaleconosco = findViewById(R.id.btn_confirma);

        confirmfaleconosco.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        confirmfaleconosco.class);
                startActivity(intent);
            }
        });
    }}
