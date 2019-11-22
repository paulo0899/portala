package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.portala.R;

public class LoginInstituicaoActivity extends AppCompatActivity {

    private TextView textViewAlterarSenha;
    private Button buttonAcessar;
    private EditText editTextEmail;
    private EditText editTextSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_instituicao);
        getSupportActionBar().hide();

        iniciarComponentes();

        textViewAlterarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AlterarSenhaInstituicaoActivity.class));
            }
        });

        buttonAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PrincipalAdministracaoActivity.class));
                finish();
            }
        });

    }

    private void iniciarComponentes(){
        textViewAlterarSenha = findViewById(R.id.textViewAlterarSenha);
        buttonAcessar = findViewById(R.id.buttonAcessar);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
    }

}
