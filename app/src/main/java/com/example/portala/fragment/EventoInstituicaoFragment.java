package com.example.portala.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.portala.R;
import com.example.portala.activity.AlterarEventoActivity;
import com.example.portala.activity.CadastrarEventoActivity;
import com.example.portala.activity.ListarEventoActivity;
import com.example.portala.activity.RemoverEventoActivity;

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

        buttonCriarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), CadastrarEventoActivity.class));
            }
        });

        buttonAlterarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AlterarEventoActivity.class));
            }
        });

        buttonRemoverEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), RemoverEventoActivity.class));
            }
        });

        buttonListarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ListarEventoActivity.class));
            }
        });

        return view;

    }

}
