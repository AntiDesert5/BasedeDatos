package com.example.basededatos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

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

    private String TITLE = "tablas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablas);
        ButterKnife.bind(this);
        noTablas();
    }

    public String noTablas() {

        Bundle extra = getIntent().getExtras();
        String d1 = extra.getString("dato01");

        noTabla.setText("Total de tablas: " + d1);
        return d1;

        /*int noTablas;
        MainActivity tablas = new MainActivity();
        noTablas = tablas.getNoTablas();
        System.out.println("checa*****: "+noTablas);
        System.out.println("checa*****: "+tablas.getNoTablas());
        String cadena = Integer.toString(noTablas);
        //noTabla.setText(cadena);*/
    }

    public void SubirDatos() {


    }

    @OnClick(R.id.btnSiguiente)
    public void onViewClicked() {
        String tabla=noTablas();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference(TITLE).child(tabla);
        List<String> al = new ArrayList<String>();


        reference.push().setValue(al);//aqui poner los datos para subirlos a base de datos
        reference.addChildEventListener(new ChildEventListener() {//para cambios en la base de datos
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {//si se añadio

            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {//si cambia

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
