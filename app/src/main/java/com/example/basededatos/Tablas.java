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
    @BindView(R.id.lf1)
    EditText lf1;
    @BindView(R.id.lf2)
    EditText lf2;
    @BindView(R.id.lf3)
    EditText lf3;
    @BindView(R.id.lf4)
    EditText lf4;
    @BindView(R.id.lf5)
    EditText lf5;
    @BindView(R.id.lf6)
    EditText lf6;
    @BindView(R.id.lf7)
    EditText lf7;
    @BindView(R.id.lf8)
    EditText lf8;
    @BindView(R.id.lf9)
    EditText lf9;
    @BindView(R.id.lv1)
    EditText lv1;
    @BindView(R.id.lv2)
    EditText lv2;
    @BindView(R.id.lv3)
    EditText lv3;
    @BindView(R.id.lv4)
    EditText lv4;
    @BindView(R.id.lv5)
    EditText lv5;
    @BindView(R.id.lv6)
    EditText lv6;
    @BindView(R.id.lv7)
    EditText lv7;
    @BindView(R.id.lv8)
    EditText lv8;
    @BindView(R.id.lv9)
    EditText lv9;

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
                Toast.makeText(Tablas.this, "Boton siguiente", Toast.LENGTH_SHORT).show();
                if (i < x) {
                    noTabla.setText("Numero de tablas: " + x);
                    i++;
                    noTabla2.setText("\tTabla numero:" + i);

                    noTabla2.setText("\tTabla numero:" + i + "\t  Restan: " + (x - i));
                    lf1.setVisibility(View.GONE);
                    lf2.setVisibility(View.GONE);
                    lf3.setVisibility(View.GONE);
                    lf4.setVisibility(View.GONE);
                    lf5.setVisibility(View.GONE);
                    lf6.setVisibility(View.GONE);
                    lf7.setVisibility(View.GONE);
                    lf8.setVisibility(View.GONE);
                    lf9.setVisibility(View.GONE);

                    lv1.setVisibility(View.GONE);
                    lv2.setVisibility(View.GONE);
                    lv3.setVisibility(View.GONE);
                    lv4.setVisibility(View.GONE);
                    lv5.setVisibility(View.GONE);
                    lv6.setVisibility(View.GONE);
                    lv7.setVisibility(View.GONE);
                    lv8.setVisibility(View.GONE);
                    lv9.setVisibility(View.GONE);


                } else if (i == x) {


                    Intent res = new Intent(Tablas.this, Resultados.class);
                    String z = Integer.toString(w);
                    res.putExtra("tabla", z);
                    startActivity(res);
                }
            }
        });
        btnOb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSiguiente.setVisibility(View.VISIBLE);
                btnOb.setVisibility(View.INVISIBLE);
                String x = editLF.getText().toString();
                String y = editLV.getText().toString();
                int x2 = Integer.parseInt(x);
                int y2 = Integer.parseInt(y);
                if(x2==0){

                }
                if (x2 == 1) {
                    lf1.setVisibility(View.VISIBLE);
                }
                if (x2 == 2) {
                    lf1.setVisibility(View.VISIBLE);
                    lf2.setVisibility(View.VISIBLE);
                }
                if (x2 == 3) {
                    lf1.setVisibility(View.VISIBLE);
                    lf2.setVisibility(View.VISIBLE);
                    lf3.setVisibility(View.VISIBLE);
                }
                if (x2 == 4) {
                    lf1.setVisibility(View.VISIBLE);
                    lf2.setVisibility(View.VISIBLE);
                    lf3.setVisibility(View.VISIBLE);
                    lf4.setVisibility(View.VISIBLE);
                }
                if (x2 == 5) {
                    lf1.setVisibility(View.VISIBLE);
                    lf2.setVisibility(View.VISIBLE);
                    lf3.setVisibility(View.VISIBLE);
                    lf4.setVisibility(View.VISIBLE);
                    lf5.setVisibility(View.VISIBLE);
                }
                if (x2 == 6) {
                    lf1.setVisibility(View.VISIBLE);
                    lf2.setVisibility(View.VISIBLE);
                    lf3.setVisibility(View.VISIBLE);
                    lf4.setVisibility(View.VISIBLE);
                    lf5.setVisibility(View.VISIBLE);
                    lf6.setVisibility(View.VISIBLE);
                }
                if (x2 == 7) {
                    lf1.setVisibility(View.VISIBLE);
                    lf2.setVisibility(View.VISIBLE);
                    lf3.setVisibility(View.VISIBLE);
                    lf4.setVisibility(View.VISIBLE);
                    lf5.setVisibility(View.VISIBLE);
                    lf6.setVisibility(View.VISIBLE);
                    lf7.setVisibility(View.VISIBLE);
                }
                if (x2 == 8) {
                    lf1.setVisibility(View.VISIBLE);
                    lf2.setVisibility(View.VISIBLE);
                    lf3.setVisibility(View.VISIBLE);
                    lf4.setVisibility(View.VISIBLE);
                    lf5.setVisibility(View.VISIBLE);
                    lf6.setVisibility(View.VISIBLE);
                    lf7.setVisibility(View.VISIBLE);
                    lf8.setVisibility(View.VISIBLE);
                }
                if (x2 == 9) {
                    lf1.setVisibility(View.VISIBLE);
                    lf2.setVisibility(View.VISIBLE);
                    lf3.setVisibility(View.VISIBLE);
                    lf4.setVisibility(View.VISIBLE);
                    lf5.setVisibility(View.VISIBLE);
                    lf6.setVisibility(View.VISIBLE);
                    lf7.setVisibility(View.VISIBLE);
                    lf8.setVisibility(View.VISIBLE);
                    lf9.setVisibility(View.VISIBLE);
                }
                if(x2<0||x2>9){
                    Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                    btnOb.setVisibility(View.VISIBLE);
                    btnSiguiente.setVisibility(View.INVISIBLE);
                    bloqueo();
                }
                if(y2==0){
                    if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                }
                if (y2 == 1) {
                    lv1.setVisibility(View.VISIBLE);
                    if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                }
                if (y2 == 2) {
                    lv1.setVisibility(View.VISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                }
                if (y2 == 3) {
                    lv1.setVisibility(View.VISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    lv3.setVisibility(View.VISIBLE);if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                    }
                if (y2 == 4) {
                    lv1.setVisibility(View.VISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    lv3.setVisibility(View.VISIBLE);
                    lv4.setVisibility(View.VISIBLE);if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                    }
                if (y2 == 5) {
                    lv1.setVisibility(View.VISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    lv3.setVisibility(View.VISIBLE);
                    lv4.setVisibility(View.VISIBLE);
                    lv5.setVisibility(View.VISIBLE);
                    if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                    }
                if (y2 == 6) {
                    lv1.setVisibility(View.VISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    lv3.setVisibility(View.VISIBLE);
                    lv4.setVisibility(View.VISIBLE);
                    lv5.setVisibility(View.VISIBLE);
                    lv6.setVisibility(View.VISIBLE);
                    if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                    }
                if (y2 == 7) {
                    lv1.setVisibility(View.VISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    lv3.setVisibility(View.VISIBLE);
                    lv4.setVisibility(View.VISIBLE);
                    lv5.setVisibility(View.VISIBLE);
                    lv6.setVisibility(View.VISIBLE);
                    lv7.setVisibility(View.VISIBLE);
                    if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                    }
                if (y2 == 8) {
                    lv1.setVisibility(View.VISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    lv3.setVisibility(View.VISIBLE);
                    lv4.setVisibility(View.VISIBLE);
                    lv5.setVisibility(View.VISIBLE);
                    lv6.setVisibility(View.VISIBLE);
                    lv7.setVisibility(View.VISIBLE);
                    lv8.setVisibility(View.VISIBLE);
                    if(x2<0||x2>9){
                        Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Fija",Toast.LENGTH_SHORT).show();
                        btnOb.setVisibility(View.VISIBLE);
                        btnSiguiente.setVisibility(View.INVISIBLE);
                        bloqueo();
                    }
                    }
                if (y2 == 9) {
                    lv1.setVisibility(View.VISIBLE);
                    lv2.setVisibility(View.VISIBLE);
                    lv3.setVisibility(View.VISIBLE);
                    lv4.setVisibility(View.VISIBLE);
                    lv5.setVisibility(View.VISIBLE);
                    lv6.setVisibility(View.VISIBLE);
                    lv7.setVisibility(View.VISIBLE);
                    lv8.setVisibility(View.VISIBLE);
                    lv9.setVisibility(View.VISIBLE);
                }
                if(y2<0||y2>9){
                    Toast.makeText(Tablas.this,"No se pueden crear mas de 9 Revise valores en\nLongitud Variable",Toast.LENGTH_SHORT).show();
                    btnOb.setVisibility(View.VISIBLE);
                    btnSiguiente.setVisibility(View.INVISIBLE);
                    bloqueo();


                }

            }
        });


    }

    public String noTablas() {
        bloqueo();

        Bundle extra = getIntent().getExtras();
        String d1 = extra.getString("dato01");


        btnSiguiente.setVisibility(View.INVISIBLE);
        x = Integer.parseInt(d1);
        w=x;

        noTabla.setText("Total de tablas: " + x);
        noTabla2.setText("\tTabla numero:" + i + "\tRestan: " + (x - i));
        return d1;

    }

    void bloqueo(){
        lf1.setVisibility(View.GONE);
        lf2.setVisibility(View.GONE);
        lf3.setVisibility(View.GONE);
        lf4.setVisibility(View.GONE);
        lf5.setVisibility(View.GONE);
        lf6.setVisibility(View.GONE);
        lf7.setVisibility(View.GONE);
        lf8.setVisibility(View.GONE);
        lf9.setVisibility(View.GONE);

        lv1.setVisibility(View.GONE);
        lv2.setVisibility(View.GONE);
        lv3.setVisibility(View.GONE);
        lv4.setVisibility(View.GONE);
        lv5.setVisibility(View.GONE);
        lv6.setVisibility(View.GONE);
        lv7.setVisibility(View.GONE);
        lv8.setVisibility(View.GONE);
        lv9.setVisibility(View.GONE);
    }


}
