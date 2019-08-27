package com.example.mark3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    //metodo para mostrar el menu
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //metodo para asignar funciones correspondientes
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.tutorial)
        {
            Intent a_tutorial = new Intent(this, tutorial.class);
            startActivity(a_tutorial);
        }
        else if(id == R.id.configuracion)
        {
            //Toast.makeText(this,"opcion dos ",Toast.LENGTH_SHORT).show();
            Intent a_configuracion = new Intent(this, configuracion.class);
            startActivity(a_configuracion);
        }
        else if (id == R.id.consejos)
        {
            //Toast.makeText(this,"opcion consejos ",Toast.LENGTH_SHORT).show();
            Intent a_consejos = new Intent(this, consejos.class);
            startActivity(a_consejos);
        }
        else if (id == R.id.sugerencias)
        {
            //Toast.makeText(this,"opcion sugerencias ",Toast.LENGTH_SHORT).show();
            Intent a_sugerencias = new Intent(this, sugerencias.class);
            startActivity(a_sugerencias);
        }
        else if (id == R.id.configuracion)
        {
            //Toast.makeText(this,"opcion ajustes ",Toast.LENGTH_SHORT).show();
            Intent a_ajustes = new Intent(this, ajustes.class);
            startActivity(a_ajustes);
        }
        else if (id == R.id.salir)
        {
            Toast.makeText(this,"opcion salir ",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    //metodo para ir a la activity de gesto a voz
    public void a_gesto_voz(View view)
    {
        Intent a_gesto_voz = new Intent(this, gesto_a_voz.class);
        startActivity(a_gesto_voz);
    }

    //metodo para ir a la activity de gesto a texto
    public void a_gesto_texto(View view)
    {
        Intent a_gesto_texto = new Intent(this, gesto_a_texto.class);
        startActivity(a_gesto_texto);
    }

    //metodo para ir a la activity de texto a voz
    public void a_texto_voz(View view)
    {
        Intent a_texto_voz = new Intent(this, texto_a_voz.class);
        startActivity(a_texto_voz);
    }
    //metodo para ir a la activity de texto a gestos
    public void a_texto_gestos(View view)
    {
        Intent a_texto_gestos = new Intent(this, texto_a_gestos.class);
        startActivity(a_texto_gestos);
    }

    //metodo para in a la activity de voz señas
    public void a_voz_gestos(View view)
    {
        Intent a_voz_gestos = new Intent(this, voz_a_gestos.class);
        startActivity(a_voz_gestos);
    }
    //metodo para ir desde la activity de voz a texto
    public void a_voz_texto(View view)
    {
        Intent a_voz_texto = new Intent(this, voz_a_texto.class);
        startActivity(a_voz_texto);
    }

    //metodo que te lleva al didccionario
    public void a_diccionario(View view)
    {
        Intent a_diccionario = new Intent(this, diccionario.class);
        startActivity(a_diccionario);
    }

    //metodo que te lleva a la configuracion de la app
    public void a_config(View view)
    {
        Intent a_config = new Intent(this, configuracion.class);
        startActivity(a_config);
    }

    public void a_consejos(View view)
    {
        Intent a_consejos = new Intent(this, consejos.class);
        startActivity(a_consejos);
    }


}
