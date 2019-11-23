package com.example.portala.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.portala.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlunoFragment extends Fragment {

    private Button buttonNota;
    private Button buttonFrequencia;
    private NotaFragment notaFragment;
    private FrequenciaFragment frequenciaFragment;

    public AlunoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aluno, container, false);

        buttonNota = view.findViewById(R.id.buttonNota);
        buttonFrequencia = view.findViewById(R.id.buttonFrequencia);

        buttonNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notaFragment = new NotaFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudoAluno, notaFragment);
                transaction.commit();
            }
        });

        buttonFrequencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frequenciaFragment = new FrequenciaFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudoAluno, frequenciaFragment);
                transaction.commit();
            }
        });

        return view;
    }

}
