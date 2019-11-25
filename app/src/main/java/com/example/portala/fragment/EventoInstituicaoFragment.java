package com.example.portala.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.portala.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventoInstituicaoFragment extends Fragment {

    private Button buttonCriarEvento;
    private Button buttonAlterarEvento;
    private Button buttonRemoverEvento;
    private Button buttonListarEvento;

    public EventoInstituicaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_evento_instituicao, container, false);

        buttonCriarEvento = view.findViewById(R.id.buttonCriarEvento);
        buttonAlterarEvento = view.findViewById(R.id.buttonAlterarEvento);
        buttonRemoverEvento = view.findViewById(R.id.buttonRemoverEvento);
        buttonListarEvento = view.findViewById(R.id.buttonListarEvento);

        return view;

    }

}
