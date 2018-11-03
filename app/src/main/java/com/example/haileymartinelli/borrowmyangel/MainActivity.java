package com.example.haileymartinelli.borrowmyangel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void userLogin(View view) {
        Intent uLogin = new Intent(this, UserLogin.class);
        startActivity(uLogin);
    }

    public void angelLogin(View view) {
        Intent aLogin = new Intent(this, AngelLogin.class);
        startActivity(aLogin);
    }
}
