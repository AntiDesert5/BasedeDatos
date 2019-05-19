package com.example.basededatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Tablas extends AppCompatActivity {
    @BindView(R.id.noTabla)
    TextView noTabla;
    @BindView(R.id.editLF)
    EditText editLF;
    @BindView(R.id.editLV)
    EditText editLV;
    @BindView(R.id.btnSiguiente)
    MaterialButton btnSiguiente;
    @BindView(R.id.noTabla2)
    TextView noTabla2;
    @BindView(R.id.btnOb)
    MaterialButton btnOb;

    private String TITLE = "tablas";

    int x, i = 1, w = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.log);
        setContentView(R.layout.activity_tablas);
        ButterKnife.bind(this);
        noTablas();
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOb.setVisibility(View.VISIBLE);
                btnSiguiente.setVisibility(View.INVISIBLE);
                Toast.makeText(Tablas.this,"Boton siguiente",Toast.LENGTH_SHORT).show();
                if (i < x) {
                    noTabla.setText("Numero de tablas: " + x);
                    i++;
                    noTabla2.setText("\tTabla numero:" + i);

                    noTabla2.setText("\tTabla numero:" + i + "\t  Restan: " + (x - i));
                    String x = editLF.getText().toString();
                    String y = editLV.getText().toString();
                    int x2 = Integer.parseInt(x);
                    int y2 = Integer.parseInt(y);

                    w = w + x2 + y2;


                } else if (i == x) {
                    String x = editLF.getText().toString();
                    String y = editLV.getText().toString();
                    int x2 = Integer.parseInt(x);
                    int y2 = Integer.parseInt(y);

                    w = w + x2 + y2;

                    Intent res = new Intent(Tablas.this, Resultados.class);
                    String z = Integer.toString(w);
                    res.putExtra("dato01", z);
                    startActivity(res);
                }
            }
        });
        btnOb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSiguiente.setVisibility(View.VISIBLE);
                btnOb.setVisibility(View.INVISIBLE);

            }
        });



    }

    public String noTablas() {

        Bundle extra = getIntent().getExtras();
        String d1 = extra.getString("dato01");


        btnSiguiente.setVisibility(View.INVISIBLE);
        x = Integer.parseInt(d1);

        noTabla.setText("Total de tablas: " + x);
        noTabla2.setText("\tTabla numero:" + i + "\tRestan: " + (x - i));
        return d1;

    }






}
