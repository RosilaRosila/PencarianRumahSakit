package com.example.pencarianrumahsakitmobile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class DaftarActivity extends AppCompatActivity {
    EditText inUsername;
    EditText inPassword;
    EditText inConfirmPassword;
    TextView hal_login;
    Button btn_daftar;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        inUsername = (EditText) findViewById(R.id.inUsername);
        inPassword = (EditText) findViewById(R.id.inPassword);
        inConfirmPassword = (EditText) findViewById(R.id.inConfirmPassword);
        hal_login =(TextView) findViewById(R.id.hal_login);
        btn_daftar = (Button) findViewById(R.id.btn_daftar);
        db = new DatabaseHelper(this);

        hal_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = inUsername.getText().toString().trim();
                String pwd = inPassword.getText().toString().trim();
                String cnf_pwd = inConfirmPassword.getText().toString().trim();

                if (pwd.equals(cnf_pwd)){
                    long val = db.addUser(user,pwd);
                    if (val > 0){
                        Toast.makeText(DaftarActivity.this, "Anda telah terdaftar!", Toast.LENGTH_SHORT).show();
                        Intent intentMoveToLogin = new Intent(DaftarActivity.this, LoginActivity.class);
                        startActivity(intentMoveToLogin);
                    }else{
                        Toast.makeText(DaftarActivity.this, "Pendaftaran gagal!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(DaftarActivity.this, "Password tidak sama!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}