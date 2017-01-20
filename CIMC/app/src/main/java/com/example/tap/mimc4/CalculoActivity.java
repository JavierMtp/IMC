package com.example.tap.mimc4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculoActivity extends AppCompatActivity {

    public Double calculoIMC() {
        Bundle valor_IMC = getIntent().getExtras();
        Double altura = 0.0;
        altura = valor_IMC.getDouble("altura");
        Double peso = 0.0;
        peso = valor_IMC.getDouble("peso");

        //Calculo del IMC
        double imc = peso / (altura * altura);
        String testimc = "" + imc;
        Log.d(getClass().getCanonicalName(), "ICM en Calculo: " + testimc);
        return imc;

    }
}