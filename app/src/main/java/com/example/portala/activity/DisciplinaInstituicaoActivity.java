package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.portala.R;

public class DisciplinaInstituicaoActivity extends AppCompatActivity {

    private Button buttonCadastrarDisciplina;
    private Button buttonAlterarDisciplina;
    private Button buttonRemoverDisciplina;
    private Button buttonListarDisciplina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina_instituicao);

        buttonCadastrarDisciplina = findViewById(R.id.buttonCadastrarDisciplina);
        buttonAlterarDisciplina = findViewById(R.id.buttonAlterarDisciplina);
        buttonRemoverDisciplina = findViewById(R.id.buttonRemoverDisciplina);
        buttonListarDisciplina = findViewById(R.id.buttonListarDisciplina);

        buttonCadastrarDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DisciplinaInstituicaoActivity.this, CadastrarDisciplinaActivity.class));
            }
        });

        buttonAlterarDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DisciplinaInstituicaoActivity.this, AlterarDisciplinaActivity.class));
            }
        });

        buttonRemoverDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DisciplinaInstituicaoActivity.this, RemoverDisciplinaActivity.class));
            }
        });

        buttonListarDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DisciplinaInstituicaoActivity.this, ListarDisciplinaActivity.class));
            }
        });

    }
}
