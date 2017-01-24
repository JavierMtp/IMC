package com.example.tap.mymimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new ControlActivity(this);

        Button btnTabla = (Button)findViewById(R.id.buttonTabla);
        btnTabla.setOnClickListener(listener);

        Button btnResultado = (Button)findViewById(R.id.buttonResultado);
        btnResultado.setOnClickListener(listener);


    }
}
