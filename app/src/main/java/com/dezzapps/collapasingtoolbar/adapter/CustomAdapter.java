package com.dezzapps.collapasingtoolbar.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dezzapps.collapasingtoolbar.R;
import com.dezzapps.collapasingtoolbar.viewholder.CheeseHolder;

import java.util.List;

import fillings.Cheese;

public class CustomAdapter extends RecyclerView.Adapter<CheeseHolder> {


    private List<Cheese> cheeses;

    public CustomAdapter(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    @NonNull
    @Override
    public CheeseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cheese_item, parent, false);

        return new CheeseHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CheeseHolder holder, int position) {

        holder.bind(cheeses.get(position));

    }


    @Override
    public int getItemCount() {
        return cheeses.size();
    }


    public void removeItem(int position){
        cheeses.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, cheeses.size());
    }



}