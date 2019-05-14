package com.example.basededatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

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

    public int getNoTablas() {
        return noTablas;
    }

    public void setNoTablas(int noTablas) {
        this.noTablas = noTablas;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.material_button)
    public void onViewClicked() {
        MainActivity main = new MainActivity();
        int no=Integer.parseInt(EditTe1.getText().toString());
        main.setNoTablas(no);
        System.out.println("funciona"+main.getNoTablas());
        Intent inteuno = new Intent(MainActivity.this, Tablas.class);//Manda a la actividad Serie
        startActivity(inteuno);//Inicia la actividad
    }


}
