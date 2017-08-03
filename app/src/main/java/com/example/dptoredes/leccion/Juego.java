package com.example.dptoredes.leccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Juego extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        TextView txu = (TextView) findViewById(R.id.txtuser);
        txu.setText((String) "Hola " + getIntent().getExtras().get("usuario"));

        next = (Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                abrirJuego2();

            }

        });

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Error", Toast.LENGTH_SHORT);

                toast1.show();

            }
        }

        );
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View arg0) {
                                        // TODO Auto-generated method stub
                                        Toast toast2 =
                                                Toast.makeText(getApplicationContext(),
                                                        "Acertó", Toast.LENGTH_SHORT);

                                        toast2.show();

                                    }
                                }

        );
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View arg0) {
                                        // TODO Auto-generated method stub
                                        Toast toast3 =
                                                Toast.makeText(getApplicationContext(),
                                                        "Error", Toast.LENGTH_SHORT);

                                        toast3.show();

                                    }
                                }

        );
        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View arg0) {
                                        // TODO Auto-generated method stub
                                        Toast toast4 =
                                                Toast.makeText(getApplicationContext(),
                                                        "Error", Toast.LENGTH_SHORT);

                                        toast4.show();

                                    }
                                }

        );
        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View arg0) {
                                        // TODO Auto-generated method stub
                                        Toast toast5 =
                                                Toast.makeText(getApplicationContext(),
                                                        "Error", Toast.LENGTH_SHORT);

                                        toast5.show();

                                    }
                                }

        );
    }


    public void abrirJuego2() {


        Intent explicit_intent = new Intent(this, Juego2.class);


        startActivity(explicit_intent);



    }
}
