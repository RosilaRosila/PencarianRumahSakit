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

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    DataHelper dbcenter;

    private Button btn_rst, btn_rsud, btn_rskia, btn_rsj, btn_lct, btn_lgt;

    static final String tag = "Main";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);
        dbcenter = new DataHelper(this);

        btn_rst = (Button) findViewById(R.id.btn_rst);
        btn_rsud = (Button) findViewById(R.id.btn_rsud);
        btn_rskia = (Button) findViewById(R.id.btn_rskia);
        btn_rsj = (Button) findViewById(R.id.btn_rsj);
        btn_lct = (Button) findViewById(R.id.btn_lct);
        btn_lgt = (Button) findViewById(R.id.btn_lgt);

        btn_rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta = new Intent(MainActivity.this, MenuRsterdekatActivity.class);
                startActivity(intenta);
            }
        });

        btn_rsud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentb = new Intent(MainActivity.this, MenuRsudActivity.class);
                startActivity(intentb);
            }
        });

        btn_rskia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentc = new Intent(MainActivity.this, MenuRskiaActivity.class);
                startActivity(intentc);
            }
        });

        btn_rsj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentd = new Intent(MainActivity.this, MenuRsjActivity.class);
                startActivity(intentd);
            }
        });

        btn_lct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentd = new Intent(MainActivity.this, MenuRsjActivity.class);
                startActivity(intentd);
            }
        });

        btn_lgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Anda Telah Keluar!",Toast.LENGTH_SHORT).show();
                Intent intentd = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intentd);
            }
        });


        Log.v(tag, "ini di oncreate");
        Toast.makeText(this, "oncreate", Toast.LENGTH_SHORT).show();

    }
    public void logout(){
        Toast.makeText(this,"Anda berhasil keluar", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.v(tag, "ini di onResume");
        Toast.makeText(this, "onresume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(tag, "ini di onpause");
        Toast.makeText(this, "onpause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(tag, "ini di onStop");
        Toast.makeText(this, "onstop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(tag, "ini di ondestroy");
        Toast.makeText(this, "ondestory", Toast.LENGTH_SHORT).show();
    }

    //public void rsterdekat(View view){
    //    setContentView(R.layout.activity_menu_rsterdekat);
    //}

    //public void rskia(View view){
    //    setContentView(R.layout.activity_menu_rskia);
    //}

    //public void rsj(View view){
    //    setContentView(R.layout.activity_menu_rsj);
    //}

    //public void rsud(View view){
    //    setContentView(R.layout.activity_menu_rsud);
    //}

    //public void back(View view){
    //    setContentView(R.layout.activity_main);
    //}

    //public void lt(View view){
    //    setContentView(R.layout.activity_login);
    //}

    //public void jdwdok(View view){
    //   Intent intent = new Intent(this, JadwalDokterActivity.class);
    //   startActivity(intent);
    // }



}