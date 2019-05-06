package com.app.saamisulaiman.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    ImageView png;
    TextView judul, hasil;
    EditText alas, tinggi;
    Button cari;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        png = findViewById(R.id.png);
        judul = findViewById(R.id.judul);
        hasil = findViewById(R.id.hasil);
        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        cari = findViewById(R.id.cari);


        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (alas.getText().toString().isEmpty() || tinggi.getText().toString().isEmpty()) {
                    Toast.makeText(Segitiga.this, "Isi dulu goblok!", Toast.LENGTH_SHORT).show();
                } else {
                    cari();

                }
            }
        });
    }
    void cari() {
        int Alas = Integer.parseInt(alas.getText().toString());
        int Tinggi = Integer.parseInt(tinggi.getText().toString());
        int angka = 2;

        int total = Alas * Tinggi / angka ;
        hasil.setText(String.valueOf(total));
    }

}