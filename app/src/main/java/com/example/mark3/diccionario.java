package com.example.mark3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class diccionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diccionario);
    }
    public void a_menu(View view)
    {
        Intent a_menu = new Intent(this, menu.class);
        startActivity(a_menu);
    }
}
