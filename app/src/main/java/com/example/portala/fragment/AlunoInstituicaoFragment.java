package com.example.portala.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.portala.R;

import com.example.portala.activity.AlunoInstituicaoActivity;
import com.example.portala.activity.DisciplinaInstituicaoActivity;
import com.example.portala.activity.TurmaInstituicaoActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlunoInstituicaoFragment extends Fragment {

    private Button buttonAluno;
    private Button buttonTurma;
    private Button buttonDisciplina;

    public AlunoInstituicaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aluno_instituicao, container, false);

        buttonAluno = view.findViewById(R.id.buttonAlunoInst);
        buttonTurma = view.findViewById(R.id.buttonTurmaInst);
        buttonDisciplina = view.findViewById(R.id.buttonDisciplinaInst);

        buttonAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AlunoInstituicaoActivity.class));
            }
        });

        buttonTurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), TurmaInstituicaoActivity.class));
            }
        });

        buttonDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DisciplinaInstituicaoActivity.class));
            }
        });

        return view;

    }

}
