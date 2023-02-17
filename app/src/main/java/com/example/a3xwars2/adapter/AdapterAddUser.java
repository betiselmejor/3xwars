package com.example.a3xwars2.adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a3xwars2.R;
import com.example.a3xwars2.objetos.Usuario;

import java.util.List;

public class AdapterAddUser extends RecyclerView.Adapter<AdapterAddUser.MyViewHolder> {

    private List<Usuario> usuarios;

    public AdapterAddUser(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bindData(usuarios.get(position));
    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView fotoUsuario;
        TextView nombreUsuario;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            fotoUsuario = itemView.findViewById(R.id.recyclerAddFriendFotoIconLayout);
            nombreUsuario = itemView.findViewById(R.id.recyclerAddFriendUsernameLayout);
        }
        void bindData(final Usuario u){
            fotoUsuario.setImageResource(u.getFotoo());
            nombreUsuario.setText(u.getNom());
        }

    }


}
