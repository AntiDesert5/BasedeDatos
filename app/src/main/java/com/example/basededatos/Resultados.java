package com.example.basededatos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Resultados extends AppCompatActivity {


    @BindView(R.id.editLf)
    TextView editLf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        ButterKnife.bind(this);

        Bundle hola = getIntent().getExtras();
        String d1 = hola.getString("tabla");
        int x = Integer.parseInt(d1);
        editLf.setText("Total de tablas: " + x);

    }
}
