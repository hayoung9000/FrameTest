package com.example.lg.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button but1,but2,but3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1=(Button) findViewById(R.id.but1);
        but2=(Button) findViewById(R.id.but2);
        but3=(Button) findViewById(R.id.but3);
    }
}
