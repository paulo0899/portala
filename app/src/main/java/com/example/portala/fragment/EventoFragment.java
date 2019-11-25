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
public class EventoFragment extends Fragment {

    private TextView textViewTitulo;
    private TextView textViewTitulo2;
    private TextView textViewTitulo3;
    private ImageView imageViewEvento;
    private ImageView imageViewEvento2;
    private ImageView imageViewEvento3;

    public EventoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_evento, container, false);

        imageViewEvento = view.findViewById(R.id.imageViewEvento);
        imageViewEvento2 = view.findViewById(R.id.imageViewEvento2);
        imageViewEvento3 = view.findViewById(R.id.imageViewEvento3);
        textViewTitulo = view.findViewById(R.id.textViewTitulo);
        textViewTitulo2 = view.findViewById(R.id.textViewTitulo2);
        textViewTitulo3 = view.findViewById(R.id.textViewTitulo3);

        return view;

    }

}
