package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Main_sign_in extends AppCompatActivity {

    private Button loginbtn;
    private Button signupbtn;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        loginbtn = (Button) findViewById(R.id.loginbtn);
        signupbtn = (Button) findViewById(R.id.signupbtn);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        loginbtn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            if (username.getText().toString().length() != 0 && password.getText().toString().length() != 0) {
                                                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                                                    Toast.makeText(Main_sign_in.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                                                    Intent intent = new Intent(Main_sign_in.this, Main_profile.class);
                                                    startActivity(intent);
                                                } else {
                                                    Toast.makeText(Main_sign_in.this, "Dang nhap that bai", Toast.LENGTH_SHORT).show();
                                                }
                                            } else {
                                                Toast.makeText(Main_sign_in.this, "Vui long dien day du thong tin", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    });

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Main_sign_in.this, Main_sign_up.class);
                startActivity(intent2);
            }
        });

    }
}