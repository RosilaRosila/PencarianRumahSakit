package com.example.pencarianrumahsakitmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuRsudActivity extends AppCompatActivity {

    private Button button13, button14, button15, button16, btn_kmb, btn_dfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rsud);

        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        btn_kmb = (Button) findViewById(R.id.btn_kmb);
        btn_dfr = (Button) findViewById(R.id.btn_dfr);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta = new Intent(MenuRsudActivity.this, JadwalDokterActivity.class);
                startActivity(intenta);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentb = new Intent(MenuRsudActivity.this, FasilitasActivity.class);
                startActivity(intentb);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc = new Intent(MenuRsudActivity.this, ContactActivity.class);
                startActivity(intentc);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentd = new Intent(MenuRsudActivity.this, FasilitasActivity.class);
                startActivity(intentd);
            }
        });

        btn_kmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intente = new Intent(MenuRsudActivity.this, MainActivity.class);
                startActivity(intente);
            }
        });

        btn_dfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intente = new Intent(MenuRsudActivity.this, DaftarPasienActivity.class);
                startActivity(intente);
            }
        });
    }



    //public void contact(View view){
      //  setContentView(R.layout.activity_contact);
   // }
}