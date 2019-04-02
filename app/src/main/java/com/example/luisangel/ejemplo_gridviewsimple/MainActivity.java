package com.example.luisangel.ejemplo_gridviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<String> listaAprobadoMovil2=new ArrayList<String>();


        listaAprobadoMovil2.add("Kevin");
        listaAprobadoMovil2.add("Grabriela");
        listaAprobadoMovil2.add("Narely");
        listaAprobadoMovil2.add("Kevin Cuadrado");
        listaAprobadoMovil2.add("Yanira");

        GridView GVmisAmigos=(GridView)findViewById(R.id.gvDatos);
        GVmisAmigos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaAprobadoMovil2 ));
    }
}
