package com.example.dptoredes.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Start = (Button)findViewById(R.id.start);
        Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                abrirJuego();

            }

        });

    }

    public void abrirJuego() {

        //Intent intent = new Intent(this, AcercaDe.class);
        //Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:962849347"));
        //startActivity(intent);
        TextView texto1 = (EditText) findViewById( R.id.username );

        Intent explicit_intent = new Intent(this, Juego.class);
        String auxTexto1= texto1.getText().toString();

        explicit_intent.putExtra("usuario",auxTexto1);

        startActivity(explicit_intent);



    }

}
