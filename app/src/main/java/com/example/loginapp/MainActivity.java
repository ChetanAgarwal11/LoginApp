package com.example.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText username,password;
    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btlogin = findViewById(R.id.btlogin);
        btlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btlogin: {
                String etusername = username.getText().toString();
                String etpassword = password.getText().toString();
                if(etusername.equalsIgnoreCase("admin") && etpassword.equalsIgnoreCase("admin")){
                    Toast.makeText(getApplicationContext(),"LogInSucess",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(this,newActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"LogInFailed",Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
