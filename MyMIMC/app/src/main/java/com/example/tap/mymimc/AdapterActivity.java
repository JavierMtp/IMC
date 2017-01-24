package com.example.tap.mymimc;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterActivity extends BaseAdapter {

    private Context context;
    private String[] arrayIMC;
    private String[] arrayMensaje;
    private int celda;
    private Integer[] arrayImagenes;

    public int getCount () {
        return arrayIMC.length;
    }

    public long getItemId (int position){ //Método obligatorio
        return position;
    }

    public Object getItem (int position) { //Método obligatorio
        return null;
    }

    public AdapterActivity (Context c, String[] arrayIMC, String [] arrayMensaje,  Integer[] arrayImagenes, int celda) {
        context = c;
        this.arrayIMC = arrayIMC;
        this.arrayMensaje = arrayMensaje;
        this.arrayImagenes = arrayImagenes;
        this.celda = celda;
    }

    public View getView (int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v==null) { //Se infla la vista si es la primera vez que se va a mostrar
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            v = layoutInflater.inflate(celda, null);
        }

        TextView textViewArrayIMC = (TextView) v.findViewById(R.id.textView_ArrayIMC);
        TextView textViewArrayMensaje = (TextView) v.findViewById(R.id.textView_ArrayMensaje);
        ImageView imageViewArrayImagenes = (ImageView) v.findViewById(R.id.imageView_ArrayImagenes);

        textViewArrayIMC.setText(arrayIMC[position]);
        textViewArrayMensaje.setText(arrayMensaje[position]);
        imageViewArrayImagenes.setImageResource(arrayImagenes[position]);

        return v;
    }

}