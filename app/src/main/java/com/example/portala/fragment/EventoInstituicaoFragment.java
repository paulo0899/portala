package com.example.portala.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.portala.R;
import com.example.portala.activity.AlterarEventoActivity;
import com.example.portala.activity.CadastrarEventoActivity;
import com.example.portala.activity.ListarEventoActivity;
import com.example.portala.activity.RemoverEventoActivity;
import com.example.portala.adapter.AdapterEvento;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventoInstituicaoFragment extends Fragment {

    private Button buttonCriarEvento;
    private RecyclerView recyclerViewEvento;

    public EventoInstituicaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_evento_instituicao, container, false);

        buttonCriarEvento = view.findViewById(R.id.buttonCriarEvento);
        recyclerViewEvento = view.findViewById(R.id.recyclerViewEvento);


        buttonCriarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), CadastrarEventoActivity.class));
            }
        });

        configurandoRecyclerView();

        return view;

    }

    public void configurandoRecyclerView(){
        //Confirgurando Adapter
        AdapterEvento adapterEvento = new AdapterEvento();

        //Configurando RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewEvento.setLayoutManager(layoutManager);
        recyclerViewEvento.setHasFixedSize(true);
        recyclerViewEvento.setAdapter(adapterEvento);
    }

}
