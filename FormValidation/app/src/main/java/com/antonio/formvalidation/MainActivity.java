package com.antonio.formvalidation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etUsername, etPassword;
    TextView tvCreateAccount;
    Button btnLogin;
    String username, password;
    int formsuccess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        tvCreateAccount = findViewById(R.id.tvCreateAccount);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
        tvCreateAccount.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
                formsuccess = 2;
                username = etUsername.getText().toString();
                password = etPassword.getText().toString();

                if (username.equals("")){
                    etUsername.setError("This Field is Required");
                    formsuccess--;
            }

                if (password.equals("")){
                    etPassword.setError("This Field is Required");
                    formsuccess--;
            }
                if (formsuccess == 2){
                Toast.makeText(this, "Success!!", Toast.LENGTH_SHORT).show();
            }
                break;
            case R.id.tvCreateAccount:
                 Intent signup = new Intent(this, SignupActivity.class);
                 startActivity(signup);
                 break;
        }
    }
}
