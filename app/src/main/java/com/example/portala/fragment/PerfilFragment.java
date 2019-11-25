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
public class PerfilFragment extends Fragment {

    private TextView textViewNome;
    private TextView textViewEmail;
    private TextView textViewNomeUsuario;
    private TextView textViewEmailUsuario;
    private ImageView imageViewFotoPerfil;
    private Button buttonSair;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        textViewNome = view.findViewById(R.id.textViewNome);
        textViewEmail = view.findViewById(R.id.textViewEmail);
        textViewNomeUsuario = view.findViewById(R.id.textViewNomeUsuario);
        textViewEmailUsuario = view.findViewById(R.id.textViewEmailUsuario);
        imageViewFotoPerfil = view.findViewById(R.id.imageViewFotoPerfil);
        buttonSair = view.findViewById(R.id.buttonDeslogar);

        return view;

    }

}
