package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtnama,edtnim,edttahunLahir;
    Button btntampilan, btnbersih;
    TextView txtvnama,txtvnim,txtvlahir,txtvumur;

    String nama,nim;
    Integer tahunnlahir,umurr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnama = findViewById(R.id.edtnama);
        edtnim = findViewById(R.id.edtnim);
        edttahunLahir = findViewById(R.id.edtlahir);
        btntampilan = findViewById(R.id.btntampil);
        btnbersih = findViewById(R.id.btnbersih);
        txtvnama = findViewById(R.id.txtviewnama);
        txtvnim = findViewById(R.id.txtviewnim);
        txtvlahir = findViewById(R.id.txtviewlahir);
        txtvumur = findViewById(R.id.txtviewumur);

        btntampilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nim = edtnim.getText().toString();
                nama = edtnama.getText().toString();
                tahunnlahir = Integer.parseInt(edttahunLahir.getText().toString().trim());
                umurr =(2024 - tahunnlahir);

                txtvnim.setText("Nim : " + nim);
                txtvnama.setText("Nama : " + nama);
                txtvlahir.setText("tahun lahir : " + tahunnlahir);
                txtvumur.setText("umur : " + umurr);
            }
        });

        btnbersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvnim.setText("");
                txtvnama.setText("");
                txtvlahir.setText("");
                txtvumur.setText("");
                edtnim.setText("");
                edtnama.setText("");
                edttahunLahir.setText("");
            }
        });
    }
}

