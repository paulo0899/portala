package com.example.portala.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portala.R;
import com.example.portala.model.Aluno;

public class AdapterAluno extends RecyclerView.Adapter<AdapterAluno.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista_aluno, parent, false
        );

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Aluno aluno = new Aluno();
        holder.idAluno.setText(aluno.getIdAluno());
        holder.nomeAluno.setText(aluno.getNomeAluno());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView idAluno;
        TextView nomeAluno;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            idAluno = itemView.findViewById(R.id.textViewMatriculaAluno);
            nomeAluno = itemView.findViewById(R.id.textViewNomeAluno);
        }
    }

}
