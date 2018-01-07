package com.example.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by chetanagarwal on 04/01/18.
 */

public class newActivity extends Activity{
    EditText username, password;
    Button btlogin;
    TextView tvsignup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        tvsignup = findViewById(R.id.tvsignup);
        btlogin = findViewById(R.id.btlogin);
        tvsignup.setOnClickListener((View.OnClickListener) this);
    }
}
