package com.example.tap.mymimc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.tap.mymimc.R.layout.activity_resultado;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_resultado);

        View.OnClickListener listener = new ControlActivity(this);

        Button btnVRes = (Button)findViewById(R.id.buttonVolverResultado);
        btnVRes.setOnClickListener(listener);

        String mensaje = getIntent().getExtras().getString("mensaje");

        Log.d(getClass().getCanonicalName(), mensaje);

        TextView resultado = (TextView) findViewById(R.id.textView_resultado);
        resultado.setText(mensaje);

    }
}
