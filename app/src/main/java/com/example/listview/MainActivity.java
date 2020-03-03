package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button ch1 ,ch2 ,ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1=findViewById(R.id.Ch1);
        ch2=findViewById(R.id.Ch2);
        ch3=findViewById(R.id.Ch3);

        ch1.setOnClickListener(this);
        ch2.setOnClickListener(this);
        ch3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        if (v.getId()==R.id.Ch1){
            Intent intent=new Intent(MainActivity.this,listview.class);
            intent.putExtra("chapter","chapter1");
            startActivity(intent);
        }

        if (v.getId()==R.id.Ch2){
            Intent intent=new Intent(MainActivity.this,listview.class);
            intent.putExtra("chapter","chapter2");
            startActivity(intent);
        }
         if (v.getId()==R.id.Ch3){
            Intent intent=new Intent(MainActivity.this,listview.class);
            intent.putExtra("chapter","chapter3");
            startActivity(intent);
        }

    }
}
