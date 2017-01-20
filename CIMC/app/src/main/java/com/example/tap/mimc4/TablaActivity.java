package com.example.tap.mimc4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TablaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla);

        View.OnClickListener listener = new ControlActivity(this);

        Button btnVTabla = (Button)findViewById(R.id.buttonVolverTabla);
        btnVTabla.setOnClickListener(listener);
    }
}