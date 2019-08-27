package com.example.mark3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo para pasar al loguin

    public void a_login(View view)
    {
        Intent a_login = new Intent(this, login.class);
        startActivity(a_login);
    }
}
