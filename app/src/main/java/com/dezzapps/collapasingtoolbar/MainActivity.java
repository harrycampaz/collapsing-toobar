package com.dezzapps.collapasingtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dezzapps.collapasingtoolbar.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

import fillings.Cheese;
import fillings.models.Brie;
import fillings.models.Camemebert;
import fillings.models.Cheddar;
import fillings.models.Feta;
import fillings.models.Gorgonzola;
import fillings.models.Mahones;
import fillings.models.Manchego;
import fillings.models.Mozzarella;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);

        List<Cheese> cheeses = createCheeses();
        CustomAdapter adapter = new CustomAdapter(cheeses);

        recyclerView.setLayoutManager(new LinearLayoutManager((this)));

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }


    private List<Cheese> createCheeses(){

        List<Cheese> cheeses = new ArrayList<Cheese>();

        cheeses.add(new Brie());
        cheeses.add(new Camemebert());
        cheeses.add(new Cheddar());
        cheeses.add(new Feta());
        cheeses.add(new Gorgonzola());
        cheeses.add(new Mahones());
        cheeses.add(new Mozzarella());
        cheeses.add(new Manchego());

        return  cheeses;


    }
}

