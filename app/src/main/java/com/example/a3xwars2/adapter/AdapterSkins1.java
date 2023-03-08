package com.example.a3xwars2.adapter;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a3xwars2.R;
import com.example.a3xwars2.SelectListner;
import com.example.a3xwars2.objetos.Skin;
import com.example.a3xwars2.objetos.Usuario;

import java.util.List;

public class AdapterSkins1 extends RecyclerView.Adapter<AdapterSkins1.MyViewHolder>{

    private List<Skin> skins;

    private SelectListner listner;

    public AdapterSkins1(List<Skin> skins) {
        this.skins = skins;
    }

    public AdapterSkins1(List<Skin> skins, SelectListner listner) {
        this.skins = skins;
        this.listner = listner;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_skin_recycler,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bindData(skins.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listner.onItemClicked(skins.get(position));
            }
        });


    }

    @Override
    public int getItemCount() {
        return skins.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView skin;
        TextView nombreskin;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            skin = itemView.findViewById(R.id.recyclerskinsSkin);
            nombreskin = itemView.findViewById(R.id.recyclerskinsSkinName);
            cardView = itemView.findViewById(R.id.cardviewSkin);
        }
        void bindData(final Skin s){
            skin.setImageResource(s.getSkin());
            nombreskin.setText(s.getNom());
        }

    }


}
