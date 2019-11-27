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
import com.example.portala.adapter.AdapterDisciplina;

public class DisciplinaInstituicaoActivity extends AppCompatActivity {

    private Button buttonCadastrarDisciplina;
    private RecyclerView recyclerViewDisciplina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina_instituicao);

        buttonCadastrarDisciplina = findViewById(R.id.buttonCadastrarDisciplina);
        recyclerViewDisciplina = findViewById(R.id.recyclerViewDisciplina);

        buttonCadastrarDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DisciplinaInstituicaoActivity.this, CadastrarDisciplinaActivity.class));
            }
        });



        //Confirgurando Adapter
        AdapterDisciplina adapterDisciplina = new AdapterDisciplina();

        //Configurando RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewDisciplina.setLayoutManager(layoutManager);
        recyclerViewDisciplina.setHasFixedSize(true);
        recyclerViewDisciplina.setAdapter(adapterDisciplina);

    }
}
