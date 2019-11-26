package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.portala.R;
import com.example.portala.adapter.AdapterAluno;

public class AlunoInstituicaoActivity extends AppCompatActivity {

    private Button buttonCadastrarAluno;
    private RecyclerView recyclerViewAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno_instituicao);

        buttonCadastrarAluno = findViewById(R.id.buttonCadastrarAluno);
        recyclerViewAluno = findViewById(R.id.recyclerViewAluno);

        //Confirgurando Adapter
        AdapterAluno adapterAluno = new AdapterAluno();

        //Configurando RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewAluno.setLayoutManager(layoutManager);
        recyclerViewAluno.setHasFixedSize(true);
        recyclerViewAluno.setAdapter(adapterAluno);

        buttonCadastrarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CadastrarAlunoActivity.class));
            }
        });

    }
}
