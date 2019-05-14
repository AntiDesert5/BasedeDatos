package com.example.basededatos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Tablas extends AppCompatActivity {
    @BindView(R.id.noTabla)
    TextView noTabla;
    @BindView(R.id.editLF)
    EditText editLF;
    @BindView(R.id.editLV)
    EditText editLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablas);
        ButterKnife.bind(this);
        noTablas();
    }

    public void noTablas() {
        int noTablas;
        MainActivity tablas = new MainActivity();
        noTablas = tablas.getNoTablas();
        System.out.println("checa*****: "+noTablas);
        System.out.println("checa*****: "+tablas.getNoTablas());
        String cadena = Integer.toString(noTablas);
        noTabla.setText(cadena);
    }

}
