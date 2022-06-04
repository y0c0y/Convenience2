package com.example.convenience;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter_gs2 extends RecyclerView.Adapter<CustomAdapter_gs2.CustomViewHolder> {

    private ArrayList<gs_tpo_> arrayList;
    private Context context;

    public CustomAdapter_gs2(ArrayList<gs_tpo_> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_gs_tpo,parent,false);
        CustomViewHolder holder=new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.tv_id_name.setText(arrayList.get(position).getName());
        holder.tv_id_price.setText(arrayList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv_id_name;
        TextView tv_id_price;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_id_name=itemView.findViewById(R.id.tv_id_name);
            this.tv_id_price=itemView.findViewById(R.id.tv_id_price);
        }
    }
}