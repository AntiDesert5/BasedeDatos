package com.example.basededatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Tablas extends AppCompatActivity {
    @BindView(R.id.noTabla)
    TextView noTabla;
    @BindView(R.id.btnSiguiente)
    MaterialButton btnSiguiente;
    @BindView(R.id.noTabla2)
    TextView noTabla2;
    @BindView(R.id.btnOb)
    MaterialButton btnOb;
    @BindView(R.id.Linearuno)
    LinearLayout Linearuno;
    @BindView(R.id.Lineardos)
    LinearLayout Lineardos;
    @BindView(R.id.LinearFija)
    LinearLayout LinearFija;
    @BindView(R.id.LinearVariable)
    LinearLayout LinearVariable;
    @BindView(R.id.Lineartres)
    LinearLayout Lineartres;
    @BindView(R.id.Linearcuatro)
    LinearLayout Linearcuatro;
    @BindView(R.id.fija)
    EditText fija;
    @BindView(R.id.var)
    EditText var;
    EditText et = null;
    List<EditText> Editextsfijo = new ArrayList<EditText>();
    List<EditText> Editextsvar = new ArrayList<EditText>();
    int cont = 1;
    int contobt = 0;
    int x;
    int auxx = 1;
    int sum=0;
    int sum2=0;
    int contt=0;
    int contvar=0;
    @BindView(R.id.Linearcinco)
    LinearLayout Linearcinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.log);
        setContentView(R.layout.activity_tablas);
        ButterKnife.bind(this);
        Bundle extra = getIntent().getExtras();
        String d1 = extra.getString("dato01");


        x = Integer.parseInt(d1);
        System.out.println("total tablas:" + x + "\n");


    }

    public void obtener() {


        int numfija = Integer.parseInt(fija.getText().toString());
        int numvar = Integer.parseInt(var.getText().toString());
        contt+=numfija+numvar;
        contvar+=numvar;
        for (int i = 0; i < numfija; i++) {

            et = new EditText(Tablas.this);
            et.setHint("Ingrese numero");
            Editextsfijo.add(et);
            LinearFija.addView(et);

        }
        for (int i = 0; i < numvar; i++) {

            et = new EditText(Tablas.this);
            et.setHint("Ingrese numero");
            Editextsvar.add(et);
            LinearVariable.addView(et);
        }


    }

    public void siguiente() {


        if (auxx < x) {
            noTabla.setText("Numero de tablas: " + x);
            auxx++;
            noTabla2.setText("\tTabla numero:" + cont);


            noTabla2.setText("\tTabla numero:" + cont + "\t  Restan: " + (x - cont));
        }

        int numfija = Integer.parseInt(fija.getText().toString());
        int numvar = Integer.parseInt(var.getText().toString());

        for (int i = 0; i < numfija; i++) {

            et = new EditText(Tablas.this);
            et.setHint("Ingrese numero");
            Editextsfijo.add(et);
            LinearFija.addView(et);

        }
        for (int i = 0; i < numvar; i++) {

            et = new EditText(Tablas.this);
            et.setHint("Ingrese numero");
            Editextsvar.add(et);
            LinearVariable.addView(et);
        }

    }

    public void buttonaceptar() {
        Button button = new Button(Tablas.this);
        button.setText("Aceptar");
        button.setContentDescription("Buttonacep");
        button.setOnClickListener(new ButtonsOnClickListener());
        Linearcinco.addView(button);
    }

    class ButtonsOnClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {


            for (int i = 0; i < Editextsfijo.size(); i++) {
                EditText aux = Editextsfijo.get(i);
                String dat=aux.getText().toString();
                int entero = Integer.parseInt(dat);
                sum+=entero;

                System.out.println(aux.getText().toString());
                System.out.println("Resu1"+sum);
            }
            for (int i = 0; i < Editextsvar.size(); i++) {
                EditText aux = Editextsvar.get(i);
                int entero = Integer.parseInt(aux.getText().toString());
                sum2+=entero;
                System.out.println(aux.getText().toString());
                System.out.println("Resu2"+sum2);
            }

            result(sum,sum2,contt,contvar);
        }

    }


    public void result(int resulfijo,int resulvar,int numtotal,int contvar){//este es el importante aqui ya estan sumados los datos y separados en fijos y variables
        System.out.println("fijo:"+resulfijo+"var:"+resulvar+"filas: "+numtotal+"contvar: "+contvar);
        int nullmap=(int)2+((numtotal+7)/8);
        System.out.println("nullmap: "+nullmap);


    }
    @OnClick({R.id.btnOb, R.id.btnSiguiente})
    public void onViewClicked(View view) {



        switch (view.getId()) {
            case R.id.btnOb:
                contobt++;
                if (fija.getText().toString().isEmpty() || var.getText().toString().isEmpty()) {
                    Toast.makeText(Tablas.this, "Rellene todos los campos", Toast.LENGTH_LONG).show();
                }
                if (contobt == 1) {
                    obtener();
                    if (cont == x) {
                        btnSiguiente.setEnabled(false);
                        buttonaceptar();
                    }
                } else {
                    obtener();
                }
                break;
            case R.id.btnSiguiente:
                cont++;
                if (cont == x) {
                    btnSiguiente.setEnabled(false);
                    buttonaceptar();
                }
                LinearFija.removeAllViews();
                LinearVariable.removeAllViews();
                fija.getText().clear();
                var.getText().clear();

                for (int i = 0; i < Editextsfijo.size(); i++) {
                    EditText aux = Editextsfijo.get(i);
                    System.out.println(aux.getText().toString());
                }
                for (int i = 0; i < Editextsvar.size(); i++) {
                    EditText aux = Editextsvar.get(i);

                    System.out.println(aux.getText().toString());

                }
                break;
        }
    }
}
