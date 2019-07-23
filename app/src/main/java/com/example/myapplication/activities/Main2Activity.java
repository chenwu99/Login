package com.example.myapplication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import com.example.myapplication.users.People;
import com.example.myapplication.R;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView c1, c2, c3;
    private Button butto1;
    private Switch s;
    private RadioGroup r1;
    private RadioButton b1,b2;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__main2);
        Intent intent = getIntent();
        //People user = (People) intent.getSerializableExtra("user");
        c1 = findViewById(R.id.textView4);
        c2 = findViewById(R.id.textView5);
        c3 = findViewById(R.id.textView6);
        butto1 = findViewById(R.id.button);
        b1=findViewById(R.id.radioButton3);
        b2=findViewById(R.id.radioButton4);
        seekBar=findViewById(R.id.seekBar);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        s = findViewById(R.id.switch1);
        butto1.setOnClickListener(this);
        c3.setOnClickListener(this);
        c2.setOnClickListener(this);
        c1.setOnClickListener(this);
        final TextView textView = findViewById(R.id.textView7);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("当前进度" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent =new Intent();//由main到main2已经创建过路径。其实这个返回对象是为了在登录的时候可以输出对象中的相关信息。
                People userr=new People();
                userr.setName(c1.getText().toString());//设置对象中数据；
                userr.setPassword(c2.getText().toString());
                if(b1.isChecked()) {
                    userr.setSex("男");
                }
                else {
                    userr.setSex("女");
                }
                userr.setPhone(c3.getText().toString());
                if(s.isChecked()) {
                    userr.setVIP("会员");
                }
                else {
                    userr.setVIP("非会员");
                }
                userr.setNumber(seekBar.getProgress());
                Bundle bundle=new Bundle();
                bundle .putSerializable("userr",userr);
                intent.putExtras(bundle);
                setResult(RESULT_OK,intent);
                finish();
                break;
        }
    }
}





