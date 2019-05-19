package com.example.basededatos;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private int noTablas;
    @BindView(R.id.edit4)
    TextInputLayout edit4;
    @BindView(R.id.material_button)
    MaterialButton materialButton;
    @BindView(R.id.EditTe1)
    EditText EditTe1;


    /*public int getNoTablas() {
        return noTablas;
    }

    public void setNoTablas(int noTablas) {
        this.noTablas = noTablas;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.tx);
        ButterKnife.bind(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @OnClick(R.id.material_button)
    public void onViewClicked() {


        String x=EditTe1.getText().toString();
        if(EditTe1.toString().isEmpty()){
            Toast.makeText(MainActivity.this,"Indique un dato Valido",Toast.LENGTH_SHORT).show();
        }
        else if(EditTe1.toString()=="0"){
            Toast.makeText(MainActivity.this,"No se pueden crear 0 tablas",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent inteuno = new Intent(MainActivity.this, Tablas.class);//Manda a la actividad Serie
            inteuno.putExtra("dato01", x);
            startActivity(inteuno);
        }


        /*MainActivity main = new MainActivity();
        int no=Integer.parseInt(EditTe1.getText().toString());
        //main.setNoTablas(no);
        getIntent().putExtra("dato01",x);
        /*System.out.println("funciona"+main.getNoTablas());
        Intent inteuno = new Intent(MainActivity.this, Tablas.class);//Manda a la actividad Serie
        startActivity(inteuno);//Inicia la actividad*/
    }


}
