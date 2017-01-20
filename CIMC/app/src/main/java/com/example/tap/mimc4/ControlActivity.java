package com.example.tap.mimc4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class ControlActivity implements View.OnClickListener{

    private Context context;

    public ControlActivity(Context context)
    {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        int boton = v.getId();

        switch (boton) {
            case R.id.buttonTabla:
                //Pulsa Tabla en activity_main
                Log.d(getClass().getCanonicalName(), "Pulsa Tabla");
                Intent intent = new Intent(context, TablaActivity.class);
                context.startActivity(intent);
                break;

            case R.id.buttonVolverTabla:
                //Pulsa Volver en activity_tabla
                intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
                break;

            case R.id.buttonCalculo:
                //Pulsa Calculo en activity_main
                intent = new Intent(context, CalculoActivity.class);

                double altura = 0;
                double peso = 0;

                Activity a = (Activity)context;

                EditText textAltura = (EditText) a.findViewById(R.id.editTextAltura);
                EditText textPeso = (EditText) a.findViewById(R.id.editTextPeso);

                altura = Double.parseDouble(textAltura.getText().toString());
                peso = Double.parseDouble(textPeso.getText().toString());

                Log.d(getClass().getCanonicalName(), "Altura en Control: " + altura);
                Log.d(getClass().getCanonicalName(), "Peso en Control: " + peso);

                //intent.putExtra("altura", altura);
                //intent.putExtra("peso", peso);
        }
    }
}
