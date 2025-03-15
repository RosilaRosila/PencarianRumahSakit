package com.example.pencarianrumahsakitmobile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText inUsername;
    EditText inPassword;
    TextView hal_daftar;
    Button btn_login;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inUsername =(EditText) findViewById(R.id.inUsername);
        inPassword = (EditText)findViewById(R.id.inPassword);
        hal_daftar = (TextView) findViewById(R.id.hal_daftar);
        btn_login = (Button) findViewById(R.id.btn_login);
        db = new DatabaseHelper(this);

        hal_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DaftarActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = inUsername.getText().toString().trim();
                String pwd = inPassword.getText().toString().trim();
                Boolean res = db.checkUser(user, pwd);
                if (res == true)
                {
                    Toast.makeText(LoginActivity.this, "Login Berhasil!",Toast.LENGTH_SHORT).show();
                    Intent intentMoveToMain = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intentMoveToMain);
                    finish();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Login Gagal!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}