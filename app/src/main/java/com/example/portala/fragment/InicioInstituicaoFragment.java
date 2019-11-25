package com.example.portala.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.portala.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioInstituicaoFragment extends Fragment {

    private TextView textViewInicioInst;

    public InicioInstituicaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inicio_instituicao, container, false);

        textViewInicioInst = view.findViewById(R.id.textViewInicioInst);

        return view;

    }

}
