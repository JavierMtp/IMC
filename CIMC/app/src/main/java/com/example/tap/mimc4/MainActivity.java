package com.example.tap.mimc4;
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

        Button btnCalculo = (Button)findViewById(R.id.buttonCalculo);
        btnCalculo.setOnClickListener(listener);

    }

}