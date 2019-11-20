package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.portala.R;
import com.example.portala.fragment.LoginAdministradorFragment;
import com.example.portala.fragment.LoginUsuarioFragment;

public class LoginActivity extends AppCompatActivity {

    private Button buttonUsuario, buttonAdministracao;
    private LoginUsuarioFragment loginUsuarioFragment;
    private LoginAdministradorFragment loginAdministradorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        buttonUsuario = findViewById(R.id.buttonAcessoUsuario);
        buttonAdministracao = findViewById(R.id.buttonAcessoAdministracao);

        loginUsuarioFragment = new LoginUsuarioFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudoLogin, loginUsuarioFragment);
        transaction.commit();

        buttonAdministracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loginAdministradorFragment = new LoginAdministradorFragment();

                FragmentTransaction transactionAdministracao = getSupportFragmentManager().beginTransaction();
                transactionAdministracao.replace(R.id.frameConteudoLogin, loginAdministradorFragment);
                transactionAdministracao.commit();
            }
        });

        buttonUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loginUsuarioFragment = new LoginUsuarioFragment();

                FragmentTransaction transactionUsuario = getSupportFragmentManager().beginTransaction();
                transactionUsuario.replace(R.id.frameConteudoLogin, loginUsuarioFragment);
                transactionUsuario.commit();
            }
        });

    }
}
