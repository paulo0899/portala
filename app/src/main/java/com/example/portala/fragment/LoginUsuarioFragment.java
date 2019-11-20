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
public class LoginUsuarioFragment extends Fragment {

    private EditText editTextEmailUsuario;
    private EditText editTextSenhaUsuario;

    public LoginUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login_usuario, container, false);

        editTextEmailUsuario = view.findViewById(R.id.editTextEmailUsuario);
        editTextSenhaUsuario = view.findViewById(R.id.editTextSenhaUsuário);

        return view;
    }

}
