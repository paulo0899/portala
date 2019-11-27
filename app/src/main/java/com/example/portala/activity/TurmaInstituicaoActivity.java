package com.example.portala.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.portala.R;
import com.example.portala.adapter.AdapterTurma;

public class TurmaInstituicaoActivity extends AppCompatActivity {

    private Button buttonCadastrarTurma;
    private RecyclerView recyclerViewTurma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turma_instituicao);

        buttonCadastrarTurma = findViewById(R.id.buttonCadastrarTurma);
        recyclerViewTurma = findViewById(R.id.recyclerViewTurma);

        buttonCadastrarTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TurmaInstituicaoActivity.this, CadastrarTurmaActivity.class));
            }
        });

        //Configurando Adapter
        AdapterTurma adapterTurma = new AdapterTurma();

        //Configurando RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewTurma.setLayoutManager(layoutManager);
        recyclerViewTurma.setHasFixedSize(true);
        recyclerViewTurma.setAdapter(adapterTurma);

    }
}
