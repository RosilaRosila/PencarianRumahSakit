package com.example.pencarianrumahsakitmobile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuRsjActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, btn_kmb, btn_dfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rsj);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        btn_kmb = (Button) findViewById(R.id.btn_kmb);
        btn_dfr = (Button) findViewById(R.id.btn_dfr);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta = new Intent(MenuRsjActivity.this, JadwalDokterActivity.class);
                startActivity(intenta);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentb = new Intent(MenuRsjActivity.this, FasilitasActivity.class);
                startActivity(intentb);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc = new Intent(MenuRsjActivity.this, ContactActivity.class);
                startActivity(intentc);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentd = new Intent(MenuRsjActivity.this, JadwalDokterActivity.class);
                startActivity(intentd);
            }
        });

        btn_kmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intente = new Intent(MenuRsjActivity.this, MainActivity.class);
                startActivity(intente);
            }
        });

        btn_dfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intente = new Intent(MenuRsjActivity.this, DaftarPasienActivity.class);
                startActivity(intente);
            }
        });


    }


}