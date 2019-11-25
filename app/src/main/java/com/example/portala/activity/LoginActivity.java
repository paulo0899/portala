package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.portala.R;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextSenha;
    private TextView textViewAlterarSenha;
    private TextView textViewAcessoInstituicao;
    private Button buttonAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        iniciarComponentes();

        buttonAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PrincipalActivity.class));
                finish();
            }
        });

        textViewAcessoInstituicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginInstituicaoActivity.class));
            }
        });

        textViewAlterarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AlterarSenhaActivity.class));
            }
        });

    }

    private void iniciarComponentes(){
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
        textViewAlterarSenha = findViewById(R.id.textViewAlterarSenha);
        textViewAcessoInstituicao = findViewById(R.id.textViewAcessoInstituicao);
        buttonAcessar = findViewById(R.id.buttonAcessar);
    }

}
