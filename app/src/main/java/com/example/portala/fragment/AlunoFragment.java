package com.example.portala.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.portala.R;
import com.example.portala.activity.FrequenciaActivity;
import com.example.portala.activity.NotaActivity;
import com.example.portala.activity.PrincipalActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlunoFragment extends Fragment {

    private Button buttonNota;
    private Button buttonFrequencia;

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
                startActivity(new Intent(getContext(), NotaActivity.class));
            }
        });

        buttonFrequencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), FrequenciaActivity.class));
            }
        });

        return view;
    }

}
