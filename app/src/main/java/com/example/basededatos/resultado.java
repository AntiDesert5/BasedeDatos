package com.example.basededatos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class
resultado extends AppCompatActivity {

    @BindView(R.id.edit)
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        ButterKnife.bind(this);
        Tablas tablas = new Tablas();
        int a = tablas.sum;
        int b = tablas.sum2;
        edit.setText(a);

    }
}
