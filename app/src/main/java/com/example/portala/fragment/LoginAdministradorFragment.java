package com.example.portala.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.portala.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginAdministradorFragment extends Fragment {

    private EditText editTextEmailAdministracao;
    private EditText editTextSenhaAdministracao;

    private String campoEmailAdm = editTextEmailAdministracao.getText().toString();
    private String campoSenhaAdm = editTextSenhaAdministracao.getText().toString();

    public String getCampoEmailAdm() {
        return campoEmailAdm;
    }

    public String getCampoSenhaAdm() {
        return campoSenhaAdm;
    }

    public LoginAdministradorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_administrador, container, false);

        editTextEmailAdministracao = view.findViewById(R.id.editTextEmailAdministrador);
        editTextSenhaAdministracao = view.findViewById(R.id.editTextSenhaAdministrador);

        return view;
    }

}
