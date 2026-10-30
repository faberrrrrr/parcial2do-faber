package com.example.parcial_faber;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TarjetaAdapter extends RecyclerView.Adapter<TarjetaAdapter.TarjetaHolder> {

    private final List<Tarjeta> lista;

    public TarjetaAdapter(List<Tarjeta> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public TarjetaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);
        return new TarjetaHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TarjetaHolder holder, int position) {
        Tarjeta t = lista.get(position);
        holder.txtTitulo.setText(t.getTitulo());
        holder.txtDescripcion.setText(t.getDescripcion());

        Picasso.with(holder.itemView.getContext())
                .load(t.getImagenPortada())
                .fit()
                .centerCrop()
                .into(holder.imgPortada);

        Picasso.with(holder.itemView.getContext())
                .load(t.getImagenCircular())
                .fit()
                .centerCrop()
                .into(holder.imgCircular);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    static class TarjetaHolder extends RecyclerView.ViewHolder {
        ImageView imgPortada;
        CircleImageView imgCircular;
        TextView txtTitulo, txtDescripcion;

        TarjetaHolder(@NonNull View itemView) {
            super(itemView);
            imgPortada = itemView.findViewById(R.id.imgPortada);
            imgCircular = itemView.findViewById(R.id.imgCircular);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
        }
    }
}