package com.example.myapplication.activities;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.Toast;
        import com.example.myapplication.users.People;
        import com.example.myapplication.R;
        import com.example.myapplication.utils.MyLog;
        import com.example.myapplication.utils.MyToast;
        import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1,button2;
    private EditText e1,e2;
    private ImageView imag1;
    public int flag=0;
    People user=new People();
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {//初始化安卓的实例对象；
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.text1);
        e2=findViewById(R.id.text2);
        button2=findViewById(R.id.txx);
        button1=findViewById(R.id.butten10);
        imag1=findViewById(R.id.image);
        imag1.setOnClickListener(new View.OnClickListener() {//只需要将图片的名字即可。
            public void onClick(View v) {
                imag1.setImageResource(R.drawable.c99);
            }
        });
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        e2.setOnClickListener(this);
        e1.setOnClickListener(this);
        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(MainActivity.this,"点击"，Toast.LENGTH_SHORT).show();
            }
        });
        e1.setOnClickListener(this);
        e2.setOnClickListener(this);*/
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.txx://登录按钮,仅仅是启动下一个活动（传递数据），没有返回值。
                if(flag==0){
                    Toast.makeText(MainActivity.this,"先进行注册",Toast.LENGTH_SHORT).show();}
                if(flag==1){//用户登录
                    Intent intend = new Intent(MainActivity.this, Main3Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("people", user);
                    intend.putExtras(bundle);
                    startActivity(intend);
                }
                break;
            case R.id.butten10://用户注册,启动就好。
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                startActivityForResult(intent,0);
                //startActivityForResult(intent,0);
                flag=1;
                break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,@Nullable Intent date){
        switch(requestCode){
            case 0:
                if(resultCode == RESULT_OK ){
                    user=(People) date.getSerializableExtra("userr");
                    Toasty.success(MainActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                    new MyLog("qweqwe");
                }
        }
    }

}
