package com.example.portala.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.portala.R;
import com.example.portala.fragment.LoginAdministradorFragment;
import com.example.portala.fragment.LoginUsuarioFragment;
import com.example.portala.helper.ConfiguracaoFirebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private Button buttonUsuario, buttonAdministracao, buttonAcessar;
    private LoginUsuarioFragment loginUsuarioFragment;
    private LoginAdministradorFragment loginAdministradorFragment;

    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();

        verificarUsuarioLogado();

        buttonUsuario = findViewById(R.id.buttonAcessoUsuario);
        buttonAdministracao = findViewById(R.id.buttonAcessoAdministracao);
        buttonAcessar = findViewById(R.id.buttonAcessar);

        //Carregando os Fragments:
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

        //Evento botão acessar:
        buttonAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailUsuario = loginUsuarioFragment.getCampoEmailUsuario();
                String emailAdm = loginAdministradorFragment.getCampoEmailAdm();
                String senhaUsuario = loginUsuarioFragment.getCampoSenhaUsuario();
                String senhaAdm = loginAdministradorFragment.getCampoSenhaAdm();

                if ( !emailUsuario.isEmpty() ){
                    if (!senhaUsuario.isEmpty()){
                        if (buttonAcessar.isPressed()){
                            autenticacao.signInWithEmailAndPassword(
                                    emailUsuario, senhaUsuario
                            ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(LoginActivity.this,
                                                "Logado com sucesso!",
                                                Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(getApplicationContext(), PrincipalActivity.class));
                                    }else{
                                        Toast.makeText(LoginActivity.this,
                                                "Erro ao fazer login: " + task.getException(),
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                        }
                    }
                }else if (!emailAdm.isEmpty()){
                    if (!senhaAdm.isEmpty()){
                        if (buttonAcessar.isPressed()){
                            autenticacao.signInWithEmailAndPassword(
                                    emailAdm, senhaAdm
                            ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(LoginActivity.this,
                                                "Logado com sucesso!",
                                                Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(getApplicationContext(), PrincipalAdministracaoActivity.class));
                                    }else{
                                        Toast.makeText(LoginActivity.this,
                                                "Erro ao fazer login: " + task.getException(),
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                        }
                    }
                }else {
                    Toast.makeText(LoginActivity.this,
                            "Preencha a senha!",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void verificarUsuarioLogado(){
        FirebaseUser usuarioAtual = autenticacao.getCurrentUser();
        if (usuarioAtual != null){
        }else{
            Toast.makeText(LoginActivity.this,
                    "Nenhum usuário logado.",
                    Toast.LENGTH_SHORT).show();
        }
    }

}
