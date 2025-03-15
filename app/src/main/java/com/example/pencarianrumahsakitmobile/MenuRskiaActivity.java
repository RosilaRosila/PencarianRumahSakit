package com.example.pencarianrumahsakitmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuRskiaActivity extends AppCompatActivity {

    private Button button5, button6, button7, button8, btn_kmb, btn_dfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rskia);

        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        btn_kmb = (Button) findViewById(R.id.btn_kmb);
        btn_dfr = (Button) findViewById(R.id.btn_dfr);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenta = new Intent(MenuRskiaActivity.this, JadwalDokterActivity.class);
                startActivity(intenta);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentb = new Intent(MenuRskiaActivity.this, FasilitasActivity.class);
                startActivity(intentb);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc = new Intent(MenuRskiaActivity.this, ContactActivity.class);
                startActivity(intentc);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentd = new Intent(MenuRskiaActivity.this, JadwalDokterActivity.class);
                startActivity(intentd);
            }
        });

        btn_kmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intente = new Intent(MenuRskiaActivity.this, MainActivity.class);
                startActivity(intente);
            }
        });

        btn_dfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intente = new Intent(MenuRskiaActivity.this, DaftarPasienActivity.class);
                startActivity(intente);
            }
        });
    }



}