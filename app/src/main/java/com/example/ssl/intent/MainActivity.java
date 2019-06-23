package com.example.ssl.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name,pass;
    private Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.et_Name);
        pass=(EditText)findViewById(R.id.et_Pass);
        sub = (Button)findViewById(R.id.Sub);

        sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username=name.getText().toString();
        String password=pass.getText().toString();
        Intent intent = new Intent(this,InfoActivity.class);
        intent.putExtra("name",username);
        intent.putExtra("pass",password);
        Toast.makeText(this,"User Name:"+username+"\n"+"Password:"+password,Toast.LENGTH_LONG).show();
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String result = data.getStringExtra("Result");
        Toast.makeText(this,result,Toast.LENGTH_LONG).show();
    }
}
