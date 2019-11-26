package com.example.portala.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.portala.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment {

    private TextView textViewTitulo;
    private TextView textViewSubTitulo;
    private TextView textViewDescricao;
    private ImageView imageViewLogo;

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        textViewTitulo = view.findViewById(R.id.textViewTitulo);
        textViewSubTitulo = view.findViewById(R.id.textViewSubTitulo);
        textViewDescricao = view.findViewById(R.id.textViewDescricao);
        imageViewLogo = view.findViewById(R.id.imageViewLogo);

        return view;
    }

}
