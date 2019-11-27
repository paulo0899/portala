package com.example.portala.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portala.R;
import com.example.portala.model.Evento;

public class AdapterEvento extends RecyclerView.Adapter<AdapterEvento.MyViewHolderEvento> {

    @NonNull
    @Override
    public MyViewHolderEvento onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista_evento, parent, false
        );
        return new MyViewHolderEvento(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderEvento holder, int position) {
        Evento evento = new Evento();
        holder.imagemEvento.getImageAlpha();
        holder.tituloEvento.setText(evento.getTituloEvento());
        holder.descricaoEvento.getText();
    }

    @Override
    public int getItemCount() {
        return 1;
    }


    public class MyViewHolderEvento extends RecyclerView.ViewHolder {

        ImageView imagemEvento;
        TextView tituloEvento;
        TextView descricaoEvento;

        public MyViewHolderEvento(@NonNull View itemView) {
            super(itemView);

            imagemEvento = itemView.findViewById(R.id.imageViewExibirFotoEvento);
            tituloEvento = itemView.findViewById(R.id.textViewExibirTituloEvento);
            descricaoEvento = itemView.findViewById(R.id.textViewExibirDescricaoEvento);

        }
    }

}
