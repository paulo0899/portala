package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.portala.R;

public class AlunoInstituicaoActivity extends AppCompatActivity {

    private Button buttonCadastrarAluno;
    private Button buttonAlterarAluno;
    private Button buttonRemoverAluno;
    private Button buttonListarAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno_instituicao);

        buttonCadastrarAluno = findViewById(R.id.buttonCadastrarAluno);
        buttonAlterarAluno = findViewById(R.id.buttonAlterarAluno);
        buttonRemoverAluno = findViewById(R.id.buttonRemoverAluno);
        buttonListarAluno = findViewById(R.id.buttonListarAluno);

        buttonCadastrarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CadastrarAlunoActivity.class));
            }
        });

        buttonAlterarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AlterarAlunoActivity.class));
            }
        });

        buttonRemoverAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RemoverAlunoActivity.class));
            }
        });

        buttonListarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ListarAlunoActivity.class));
            }
        });

    }
}
