package com.example.sqllitetabanl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyRecycleAdaptor extends RecyclerView.Adapter<MyRecycleAdaptor.Myholder> {
    private ArrayList<Share> shares;

    public MyRecycleAdaptor(ArrayList<Share> shares){this.shares=shares;}

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.share_item,parent,false);
        return new Myholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleAdaptor.Myholder holder, int position) {
        holder.yazi.setText(shares.get(position).getYazi());
        holder.foto.setImageResource(shares.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return shares.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {
        TextView yazi;
        ImageView foto;
        public Myholder(@NonNull View itemView) {
            super(itemView);
            foto=itemView.findViewById(R.id.foto);
            yazi=itemView.findViewById(R.id.yazi);
        }


    }

}
