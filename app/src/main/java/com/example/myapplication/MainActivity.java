package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //centerInparent=true para que centre un elemento en LinerLayout se usa el peso aqui y en el Relative, en el constrain no
    // se usa peso.
    //hacer la misma bandera pero con diferentes layout: como Liner, Relative y Constrain.
    //Vamos a ver FrameLayout.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}