package com.example.marcadoraccn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    public int cont;
    public int cont1;
    private String mOrderMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textoResultado = (TextView) findViewById(R.id.cant2x2);
        textoResultado.setText(String.valueOf(cont));
        TextView textoResultado1=(TextView)findViewById(R.id.cant3x6);
        textoResultado1.setText(String.valueOf(cont1));
        FloatingActionButton fab = findViewById(R.id.floatingActionButton2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("coloqueSuCodigoAqui", "ha pulsado fab");
                mOrderMessage = getString(R.string.carrito_message);
                displayToast(mOrderMessage);
            }
        });


    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void incrementarContador(View view){
        cont++;
        mostrarResultado();
    }
    public void bajarContador(View view){
        if (cont>0) {
            cont--;
            mostrarResultado();
        }
    }
    public void mostrarResultado(){
        TextView textoResultado=(TextView)findViewById(R.id.cant2x2);
        textoResultado.setText(String.valueOf(cont));
    }
    public void agregar2x2(View view){
        if (cont>0) {
            Toast.makeText(getApplicationContext(), "agregaste " + cont + " conectores 2x2 a tu pedido",
                    Toast.LENGTH_SHORT).show();
            cont=0;
            TextView textoResultado=(TextView)findViewById(R.id.cant2x2);
            textoResultado.setText(String.valueOf(cont));
        }
    }
    public void incrementarContador_1(View view){
        cont1++;
        mostrarResultado_1();
    }
    public void bajarContador_1(View view){
        if (cont1>0) {
            cont1--;
            mostrarResultado_1();
        }
    }
    public void mostrarResultado_1(){
        TextView textoResultado1=(TextView)findViewById(R.id.cant3x6);
        textoResultado1.setText(String.valueOf(cont1));
    }
    public void agregar3x6(View view){
        if (cont1>0) {
            Toast.makeText(getApplicationContext(), "agregaste " + cont1 + " conectores 3x6 a tu pedido",
                    Toast.LENGTH_SHORT).show();
            cont1=0;
            TextView textoResultado1=(TextView)findViewById(R.id.cant3x6);
            textoResultado1.setText(String.valueOf(cont1));
        }
    }
}