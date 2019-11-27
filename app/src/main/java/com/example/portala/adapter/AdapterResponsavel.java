package com.example.portala.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portala.R;
import com.example.portala.model.Responsavel;

public class AdapterResponsavel extends RecyclerView.Adapter<AdapterResponsavel.MyViewHolderResponsavel> {

    @NonNull
    @Override
    public MyViewHolderResponsavel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista_responsavel, parent, false
        );

        return new MyViewHolderResponsavel(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderResponsavel holder, int position) {
        Responsavel responsavel = new Responsavel();
        holder.idResponsavel.setText(responsavel.getIdResponsavel());
        holder.nomeResponsavel.setText(responsavel.getNomeResponsavel());
        holder.emailResponsavel.setText(responsavel.getEmailResponsavel());
        holder.labelIdResponsavel.getText();
        holder.labelNomeResponsavel.getText();
        holder.labelEmailResponsavel.getText();
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class MyViewHolderResponsavel extends RecyclerView.ViewHolder {

        TextView idResponsavel;
        TextView nomeResponsavel;
        TextView emailResponsavel;
        TextView labelIdResponsavel;
        TextView labelNomeResponsavel;
        TextView labelEmailResponsavel;

        public MyViewHolderResponsavel(@NonNull View itemView) {
            super(itemView);

            idResponsavel = itemView.findViewById(R.id.textViewIdResponsavel);
            nomeResponsavel = itemView.findViewById(R.id.textViewNomeResponsavel);
            emailResponsavel = itemView.findViewById(R.id.textViewEmailResponsavel);
            labelIdResponsavel = itemView.findViewById(R.id.textViewLabelIdResponsavel);
            labelNomeResponsavel = itemView.findViewById(R.id.textViewLabelNomeResponsavel);
            labelEmailResponsavel = itemView.findViewById(R.id.textViewLabelEmailResponsavel);

        }
    }

}
