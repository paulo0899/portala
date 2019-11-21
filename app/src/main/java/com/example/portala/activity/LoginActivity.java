package com.example.portala.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.portala.R;
import com.example.portala.helper.ConfiguracaoFirebase;
import com.example.portala.helper.UsuarioFirebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private Button buttonAcessar;
    private EditText editTextEmail;
    private EditText editTextSenha;
    private RadioButton radioButtonResponsavel;
    private RadioButton radioButtonInstituicao;
    private RadioGroup radioGroupAcesso;

    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        //Chamando componentes por id:
        buttonAcessar = findViewById(R.id.buttonAcessar);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
        radioButtonResponsavel = findViewById(R.id.radioButtonUsuario);
        radioButtonInstituicao = findViewById(R.id.radioButtonAdministracao);
        radioGroupAcesso = findViewById(R.id.radioGroupAcesso);

        //Configurando autenticação:
        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();

        //Verificando autenticação;
        verificarUsuarioLogado();

        //Verificando tipo de acesso:
        verificaRadioGroup();

        //Evento botão acessar:
        buttonAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = editTextEmail.getText().toString();
                String senha = editTextSenha.getText().toString();

                if (!email.isEmpty()){
                    if (!senha.isEmpty()){
                        if (radioButtonResponsavel.isChecked()){
                            autenticacao.signInWithEmailAndPassword(
                                    email, senha
                            ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(LoginActivity.this,
                                                "Logado com sucesso!",
                                                Toast.LENGTH_SHORT).show();
                                        String tipoUsuario = getTipoUsuario();
                                        UsuarioFirebase.atualizarTipoUsuario(tipoUsuario);
                                        abrirTelaPrincipal(tipoUsuario);
                                    }else{
                                        Toast.makeText(LoginActivity.this,
                                                "Erro ao fazer login: " + task.getException(),
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                        }else if (radioButtonInstituicao.isChecked()){
                            autenticacao.signInWithEmailAndPassword(
                                    email, senha
                            ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(LoginActivity.this,
                                                "Logado com sucesso!",
                                                Toast.LENGTH_SHORT).show();
                                        String tipoUsuario = getTipoUsuario();
                                        UsuarioFirebase.atualizarTipoUsuario(tipoUsuario);
                                        abrirTelaPrincipal(tipoUsuario);
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

    private void verificaRadioGroup(){
        radioGroupAcesso.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioButtonUsuario){

                }else if (i == R.id.radioButtonAdministracao){

                }else{
                    Toast.makeText(LoginActivity.this,
                            "Seleciona o tipo de acesso.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void verificarUsuarioLogado(){
        FirebaseUser usuarioAtual = autenticacao.getCurrentUser();
        if (usuarioAtual != null){
            String tipoUsuario = usuarioAtual.getDisplayName();
            abrirTelaPrincipal(tipoUsuario);
        }else{
        }
    }

    private String getTipoUsuario(){
        String tipoUsuario = "";
        if (radioButtonResponsavel.isChecked()){
            tipoUsuario = radioButtonResponsavel.isChecked() ? "U" : "A";
        }
        return tipoUsuario;
    }

    private void abrirTelaPrincipal(String tipoUsuario){
        if (tipoUsuario.equals("U")){
            startActivity(new Intent(getApplicationContext(), PrincipalActivity.class));
        }else{
            startActivity(new Intent(getApplicationContext(), PrincipalAdministracaoActivity.class));
        }
    }

}
