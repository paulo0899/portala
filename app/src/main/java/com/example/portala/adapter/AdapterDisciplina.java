package com.example.portala.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portala.R;
import com.example.portala.model.Disciplina;

public class AdapterDisciplina extends RecyclerView.Adapter<AdapterDisciplina.MyViewHolderDisciplina> {

    @NonNull
    @Override
    public MyViewHolderDisciplina onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista_disciplina, parent, false
        );
        return new MyViewHolderDisciplina(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderDisciplina holder, int position) {
        Disciplina disciplina = new Disciplina();
        holder.idDisciplina.setText(disciplina.getIdDisciplina());
        holder.nomeDisciplina.setText(disciplina.getNomeDisciplina());
        holder.labelIdDisciplina.getText();
        holder.labelNomeDisciplina.getText();
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class MyViewHolderDisciplina extends RecyclerView.ViewHolder {

        TextView idDisciplina;
        TextView nomeDisciplina;
        TextView labelIdDisciplina;
        TextView labelNomeDisciplina;

        public MyViewHolderDisciplina(@NonNull View itemView) {
            super(itemView);

            idDisciplina = itemView.findViewById(R.id.textViewIdDisciplina);
            nomeDisciplina = itemView.findViewById(R.id.textViewNomeDisciplina);
            labelIdDisciplina = itemView.findViewById(R.id.textViewLabelIdDisciplina);
            labelNomeDisciplina = itemView.findViewById(R.id.textViewLabelNomeDisciplina);

        }
    }

}
