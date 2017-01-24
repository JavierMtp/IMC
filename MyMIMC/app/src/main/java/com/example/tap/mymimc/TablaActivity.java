package com.example.tap.mymimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class TablaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla);

        View.OnClickListener listener = new ControlActivity(this);

        Button btnVTabla = (Button)findViewById(R.id.buttonVolverTabla);
        btnVTabla.setOnClickListener(listener);

        String[] arrayIMC = new String[]
        {
                "IMC  ... < 16.0", "IMC 16.0 - 18.5", "IMC 18.5 - 25.0", "IMC 25-0 - 31.0", "IMC  ... > 31.0"
        };
        String[] arrayMensaje = new String[]
        {
                "Desnutrido", "Delgado", "Normal", "Sobrepeso", "Obesidad"
        };
        Integer[] arrayImages = new Integer[]
        {
                R.drawable.rednumber1, R.drawable.rednumber2, R.drawable.rednumber3, R.drawable.rednumber4, R.drawable.rednumber5
        };

        //Creamos el adapter con la informacion
        ListView listview = (ListView) findViewById(R.id.listView_Tabla);
        listview.setAdapter(new AdapterActivity(this, arrayIMC, arrayMensaje, arrayImages, R.layout.activity_celda));

    }
}

