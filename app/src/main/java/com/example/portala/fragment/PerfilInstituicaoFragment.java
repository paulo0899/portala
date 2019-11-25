package com.example.portala.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.portala.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilInstituicaoFragment extends Fragment {

    private ImageView imageViewPerfilInt;
    private TextView textViewNomeInstituicao;
    private TextView textViewNomeUsuarioInst;
    private TextView textViewEmailInstituicao;
    private TextView textViewEmailUsuarioInst;
    private TextView textViewTituloPerfilResp;
    private Button buttonCadastrarResp;
    private Button buttonAlterarResp;
    private Button buttonRemoverResp;
    private Button buttonListarResp;
    private Button buttonAlterarSenhaInst;
    private Button buttonDeslogarInst;

    public PerfilInstituicaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil_instituicao, container, false);

        imageViewPerfilInt = view.findViewById(R.id.imageViewPerfilInstituicao);
        textViewNomeInstituicao = view.findViewById(R.id.textViewNomeInst);
        textViewNomeUsuarioInst = view.findViewById(R.id.textViewNomeUsuarioInt);
        textViewEmailInstituicao = view.findViewById(R.id.textViewEmailInstituicao);
        textViewEmailUsuarioInst = view.findViewById(R.id.textViewEmailUsuarioInst);
        textViewTituloPerfilResp = view.findViewById(R.id.textViewTituloPerfilInst);
        buttonCadastrarResp = view.findViewById(R.id.buttonCadastrarResponsavel);
        buttonAlterarResp = view.findViewById(R.id.buttonAlterarResponsavel);
        buttonRemoverResp = view.findViewById(R.id.buttonRemoverResponsavel);
        buttonListarResp = view.findViewById(R.id.buttonListarResponsavel);
        buttonAlterarSenhaInst = view.findViewById(R.id.buttonAlterarSenhaInst);
        buttonDeslogarInst = view.findViewById(R.id.buttonDeslogarInst);

        return view;

    }

}
