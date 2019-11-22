package com.example.portala.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.portala.R;

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

        return view;
    }

}
