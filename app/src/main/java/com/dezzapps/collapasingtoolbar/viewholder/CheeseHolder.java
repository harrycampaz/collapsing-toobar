package com.dezzapps.collapasingtoolbar.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dezzapps.collapasingtoolbar.R;

import fillings.Cheese;

public class CheeseHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textView;

    public CheeseHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.item_image);
        textView = itemView.findViewById(R.id.item_name);
    }

    public void bind(final Cheese cheese){
        imageView.setImageResource(cheese.getImage());
        textView.setText(cheese.getName());
    }
}
