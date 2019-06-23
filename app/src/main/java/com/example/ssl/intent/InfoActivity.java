package com.example.ssl.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {
    private Button back;
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent=getIntent();
        username=intent.getStringExtra("name");
        password=intent.getStringExtra("pass");
        back=(Button)findViewById(R.id.Back);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(username.equals("aa")&&password.equals("aa")){
            Intent intent = new Intent();
            intent.setClass(InfoActivity.this,MainActivity.class);
            intent.putExtra("Result","用户名和密码正确!");
            setResult(2,intent);
            finish();
        }
        else{
            Intent intent = new Intent();
            intent.putExtra("Result","用户名和密码错误！");
            setResult(2,intent);
            finish();
        }
    }
}
