package com.example.app.poo.java.apprecyclerviewimage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.poo.java.apprecyclerviewimage.databinding.ItemAndroidBinding;

import java.util.List;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.ViewHolder> {


    private List<Android>lista;

    public AndroidAdapter(List<Android> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public AndroidAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemAndroidBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidAdapter.ViewHolder holder, int position) {
        final Android itemAndoid = lista.get(position);
        holder.binding.imgPostre.setImageResource(itemAndoid.getImagen());
        holder.binding.txtNombre.setText(itemAndoid.getNombre());
        holder.binding.txtVersion.setText(itemAndoid.getVersion());


    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemAndroidBinding binding;

        public ViewHolder(@NonNull ItemAndroidBinding itemView) {
            super(itemView.getRoot());
            binding= itemView;
        }
    }


}


