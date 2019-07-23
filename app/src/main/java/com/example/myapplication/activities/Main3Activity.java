package com.example.myapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.example.myapplication.users.People;
import com.example.myapplication.R;
import com.example.myapplication.utils.MyLog;

public class Main3Activity extends AppCompatActivity  implements View.OnClickListener {
private TextView c1,c2,c3,c4,c5,c6;
People p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__main3);
        //Intent intent=getIntent();
        p=new People();
        p=(People)getIntent() .getSerializableExtra("people");
        c1 = findViewById(R.id.textView10);
        c2 = findViewById(R.id.textView9);
        c3 = findViewById(R.id.textView8);
        c4  =findViewById(R.id.textView);
        c5 = findViewById(R.id.textView2);
        c6 = findViewById(R.id.textView3);


        /*c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"点击"，Toast.LENGTH_SHORT).show();
            }
        });*/
        c1.setOnClickListener(this);
        c3.setOnClickListener(this);
        c2.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        Log.d("123123",p+"");
        c1.setText(p.getNumber()+"");//整型要强转；
        c2.setText(p.getVIP());
        c3.setText(p.getSex());
        c4.setText(p.getName());
        c5.setText(p.getPassword());
        c6.setText(p.getPhone());
        //Log.d("123123",p.equals(null)+"");
        //Log.d("123123",p.getPassword());
    }
    @Override
    public void onClick(View v)
    {

    }
}
