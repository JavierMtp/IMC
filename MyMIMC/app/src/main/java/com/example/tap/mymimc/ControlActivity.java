package com.example.tap.mymimc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


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
                Log.d(getClass().getCanonicalName(), "Pulsa Tabla en activity_main");
                Intent intent = new Intent(context, TablaActivity.class);
                context.startActivity(intent);
                break;

            case R.id.buttonVolverTabla:
                Log.d(getClass().getCanonicalName(), "Pulsa Volver en activity_tabla");
                intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
                break;

            case R.id.buttonResultado:
                Log.d(getClass().getCanonicalName(), "Pulsa Resultado en activity_main");
                intent = new Intent(context, ResultadoActivity.class);
                intent.putExtra("mensaje", calculoMensajeIMC());
                context.startActivity(intent);
                break;

            case R.id.buttonVolverResultado:
                Log.d(getClass().getCanonicalName(), "Pulsa Volver en activity_resultado");
                intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
        }
    }

    public String calculoMensajeIMC()
    {

        double altura = 0;
        double peso = 0;

        Activity a = (Activity)context;

        EditText textAltura = (EditText) a.findViewById(R.id.editTextAltura);
        EditText textPeso = (EditText) a.findViewById(R.id.editTextPeso);

        altura = Double.parseDouble(textAltura.getText().toString());
        altura = altura / 100; //de centimetros a metros
        peso = Double.parseDouble(textPeso.getText().toString());

        Log.d(getClass().getCanonicalName(), "Altura en Control: " + altura);
        Log.d(getClass().getCanonicalName(), "Peso en Control: " + peso);

        double imc = peso / (altura * altura);
        imc = (double)Math.round(imc * 10d) / 10d; //redondea a una cifra decimal
        Log.d(getClass().getCanonicalName(), "IMC: " + imc);

        String mensaje = "";

        if (imc < 16) {
            mensaje = ". Desnutrido."; }
        else if (imc >= 16 && imc < 18.5) {
            mensaje = ". Delgado."; }
        else if (imc >= 18.5 && imc <= 25) {
            mensaje = ". Normal."; }
        else if (imc > 25 && imc <=31) {
            mensaje =  ". Sobrepeso."; }
        else  {
            mensaje = ". Obesidad."; }

        mensaje = "Tu IMC es: " + imc + mensaje;

        return mensaje;

    }
}