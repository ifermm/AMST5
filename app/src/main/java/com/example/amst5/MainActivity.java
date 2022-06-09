package com.example.amst5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre, txtApellido, txtUsuario, txtPasswd;
    private Button btnLogin, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPasswd = (EditText) findViewById(R.id.txtClave);

        btnLogin = (Button) findViewById(R.id.btnRegistro);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menudeopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.VideoView:

                return true;

            case R.id.CalendarV:
                Intent i = new Intent(this, Calendario.class);
                startActivity(i);
                return true;

            case R.id.Maps:

                return true;

            case R.id.Grafico:
                Intent i2 = new Intent(this, GraficoActivity.class);
                startActivity(i2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void registrarse(View view) {
        Intent intent = new Intent(this, formulario_registro.class);
        startActivity(intent);


    }
    public void login(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"Usted no cuenta con un usuario",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onClick(View v) {

        if(v.getId() == R.id.btnRegistro){
            Log.d("mensaje","ïngreso");
        }else if(v.getId() == R.id.btnRegistro){


        }
    }
}