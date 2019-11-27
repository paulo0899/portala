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
import com.example.portala.activity.CadastrarResponsavelActivity;
import com.example.portala.adapter.AdapterResponsavel;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioInstituicaoFragment extends Fragment {

    private RecyclerView recyclerViewResponsavel;
    private Button buttonCadastrarResponsavel;

    public InicioInstituicaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inicio_instituicao, container, false);

        recyclerViewResponsavel = view.findViewById(R.id.recyclerViewResponsavel);
        buttonCadastrarResponsavel = view.findViewById(R.id.buttonCadastrarResponsavel);

        configurandoRecyclerView();

        buttonCadastrarResponsavel.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getContext(), CadastrarResponsavelActivity.class));
           }
        });

        return view;

    }

    public void configurandoRecyclerView(){
        //Confirgurando Adapter
        AdapterResponsavel adapterResponsavel = new AdapterResponsavel();

        //Configurando RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerViewResponsavel.setLayoutManager(layoutManager);
        recyclerViewResponsavel.setHasFixedSize(true);
        recyclerViewResponsavel.setAdapter(adapterResponsavel);
    }

}
