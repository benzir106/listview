package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listview extends AppCompatActivity {
    String[] name={ "apple","orasnge","banana"};
    String[] name1={ "apple1","orasnge1","banana1"};

    private ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        String[] s =getResources().getStringArray(R.array.name3);

        list1=findViewById(R.id.listId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.sample,R.id.Ch2,name);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(getApplicationContext(),R.layout.sample,R.id.Ch2,name1);
        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(getApplicationContext(),R.layout.sample,R.id.Ch2,s);

        Intent intent=getIntent();
        String chap=intent.getStringExtra("chapter");

        if (chap.equals("chapter1")){
            list1.setAdapter(adapter);

            list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String s = (String)parent.getItemAtPosition(position);

                    Toast.makeText(listview.this,"click on " +s,Toast.LENGTH_SHORT).show();

                }
            });
        }

        if (chap.equals("chapter2")){


            list1.setAdapter(adapter1);
        } if (chap.equals("chapter3")){


            list1.setAdapter(adapter3);
        }
    }
}
