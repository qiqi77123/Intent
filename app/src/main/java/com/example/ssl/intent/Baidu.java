package com.example.ssl.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Baidu extends AppCompatActivity implements View.OnClickListener
{
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baidu);
        login = (Button)findViewById(R.id.Login);
        login.setOnClickListener(this);


            }

    @Override
    public void onClick(View v) {
        Uri uri= Uri.parse("http://www.baidu.com");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
