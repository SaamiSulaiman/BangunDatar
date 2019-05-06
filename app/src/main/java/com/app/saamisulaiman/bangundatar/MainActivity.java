package com.app.saamisulaiman.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView opening , opening2 ;
    ImageView gambar;
    Button persegi , jajar , segitiga ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void pindah(View view){
        Intent intent = new Intent(MainActivity.this, Persegi.class);
        startActivity(intent);
    }

    public void pindah2(View view){
        Intent intent = new Intent(MainActivity.this, Jajargenjang.class);
        startActivity(intent);
    }

    public void pindah3(View view){
        Intent intent = new Intent(MainActivity.this, Segitiga.class);
        startActivity(intent);
    }
}
