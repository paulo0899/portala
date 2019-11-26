package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.portala.R;

public class TurmaInstituicaoActivity extends AppCompatActivity {

    private Button buttonCadastrarTurma;
    private Button buttonAlterarTurma;
    private Button buttonRemoverTurma;
    private Button buttonListarTurma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turma_instituicao);

        buttonCadastrarTurma = findViewById(R.id.buttonCadastrarTurma);
        buttonAlterarTurma = findViewById(R.id.buttonAlterarTurma);
        buttonRemoverTurma = findViewById(R.id.buttonRemoverTurma);
        buttonListarTurma = findViewById(R.id.buttonListarTurma);

        buttonCadastrarTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaInstituicaoActivity.this, CadastrarTurmaActivity.class));
            }
        });

        buttonAlterarTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaInstituicaoActivity.this, AlterarTurmaActivity.class));
            }
        });

        buttonRemoverTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaInstituicaoActivity.this, RemoverTurmaActivity.class));
            }
        });

        buttonListarTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaInstituicaoActivity.this, ListarTurmaActivity.class));
            }
        });

    }
}
