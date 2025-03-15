package com.example.pencarianrumahsakitmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuRsterdekatActivity extends AppCompatActivity {

    private Button button9, button10, button11, button12, btn_kmb, btn_dfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rsterdekat);

        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        btn_kmb = (Button) findViewById(R.id.btn_kmb);
        btn_dfr = (Button) findViewById(R.id.btn_dfr);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta = new Intent(MenuRsterdekatActivity.this, JadwalDokterActivity.class);
               startActivity(intenta);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentb = new Intent(MenuRsterdekatActivity.this, FasilitasActivity.class);
                startActivity(intentb);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc = new Intent(MenuRsterdekatActivity.this, ContactActivity.class);
                startActivity(intentc);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentd = new Intent(MenuRsterdekatActivity.this, FasilitasActivity.class);
                startActivity(intentd);
            }
        });

        btn_kmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intente = new Intent(MenuRsterdekatActivity.this, MainActivity.class);
                startActivity(intente);
            }
        });

        btn_dfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intente = new Intent(MenuRsterdekatActivity.this, DaftarPasienActivity.class);
                startActivity(intente);
            }
        });
    }



    //public void contact(View view){
    //    setContentView(R.layout.activity_contact);
    //}
}