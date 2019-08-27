package com.example.mark3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //metodo que te lleva al menu
    public void a_menu(View view)
    {
        Intent a_menu = new Intent(this, menu.class);
        startActivity(a_menu);
    }

    public void a_registro(View view)
    {
        Intent a_registro = new Intent(this, registro.class);
        startActivity(a_registro);
    }

    public void a_facebook(View view)
    {
        Intent a_facebook = new Intent(this, log_facebook.class );
        startActivity(a_facebook);
    }
}
