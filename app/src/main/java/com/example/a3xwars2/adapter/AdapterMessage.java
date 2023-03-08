package com.example.a3xwars2.adapter;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.a3xwars2.R;
import com.example.a3xwars2.objetos.Message;

import java.util.List;

public class AdapterMessage extends RecyclerView.Adapter<AdapterMessage.MyViewHolder> {
    private List<Message> messageList;

    public AdapterMessage(List<Message> messageList) {
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public AdapterMessage.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_message_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMessage.MyViewHolder holder, int position) {
        holder.bindData(messageList.get(position));
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView message;
        TextView emisor;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            message = itemView.findViewById(R.id.messageType);
//            message.addTextChangedListener(new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////                    if (message.getPaint().measureText(charSequence.toString()) > 170) {
////                        // comienza la animación si el ancho del texto es mayor que el ancho máximo
////                        Animation animation = AnimationUtils.loadAnimation(emisor.getContext(), R.anim.text_scroll);
////                        message.startAnimation(animation);
////                    }
//                }
//
//                @Override
//                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                    // comprueba si el ancho del TextView es mayor que el ancho máximo
//                    if (message.getPaint().measureText(charSequence.toString()) > 255) {
//                        // comienza la animación si el ancho del texto es mayor que el ancho máximo
//                        Animation animation = AnimationUtils.loadAnimation(emisor.getContext(), R.anim.text_scroll);
//                        message.startAnimation(animation);
//                    }
//                }
//
//                @Override
//                public void afterTextChanged(Editable editable) {
//                    // no se requiere acción después del cambio de texto
//
//                }
//            });
            emisor = itemView.findViewById(R.id.emisor);
        }
            void bindData(final Message m){
            message.setText(m.getMessageType());
            emisor.setText(m.getEmisor());
        }
    }

}

