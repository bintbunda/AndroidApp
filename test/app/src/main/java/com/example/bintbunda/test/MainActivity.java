package com.example.bintbunda.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 =(Button) findViewById(R.id.bt1);
        bt1.setOnClickListener({openactivity2();});
                //etOnClickListener(openactivity2(););


    }
    public void openactivity2()
    {
        Intent input = new Intent(this,MyActivity2.class);
        startActivity(input);
    }
}
