package com.example.portala.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portala.R;
import com.example.portala.model.Turma;

public class AdapterTurma extends RecyclerView.Adapter<AdapterTurma.MyViewHolderTurma> {

    @NonNull
    @Override
    public MyViewHolderTurma onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista_turma, parent, false
        );
        return new MyViewHolderTurma(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderTurma holder, int position) {
        Turma turma = new Turma();
        holder.anoTurma.setText(Integer.toString(turma.getAnoTurma()));
        holder.turnoTurma.setText(turma.getTurnoTurma());
        holder.idTurma.setText(turma.getIdTurma());
        holder.labelAnoTurma.getText();
        holder.labelTurnoTurma.getText();
        holder.labelIdTurma.getText();
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class MyViewHolderTurma extends RecyclerView.ViewHolder{

        TextView anoTurma;
        TextView turnoTurma;
        TextView idTurma;
        TextView labelAnoTurma;
        TextView labelTurnoTurma;
        TextView labelIdTurma;

        public MyViewHolderTurma(@NonNull View itemView) {
            super(itemView);

            anoTurma = itemView.findViewById(R.id.textViewAnoTurma);
            turnoTurma = itemView.findViewById(R.id.textViewTurnoTurma);
            idTurma = itemView.findViewById(R.id.textViewIdTurma);
            labelAnoTurma = itemView.findViewById(R.id.textViewLabelAnoTurma);
            labelTurnoTurma = itemView.findViewById(R.id.textViewLabelTurnoTurma);
            labelIdTurma = itemView.findViewById(R.id.textViewLabelIdTurma);

        }
    }

}
