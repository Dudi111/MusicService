package com.example.musicservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mbtnstart;
    private Button mbtnstop;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        mbtnstart=findViewById(R.id.btnstart);
        mbtnstop=findViewById(R.id.btnstop);
        intent=new Intent(this,MusicService.class);

        mbtnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
            }
        });
        mbtnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              stopService(intent);
            }
        });
    }
}