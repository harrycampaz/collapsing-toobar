package com.dezzapps.collapasingtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;


import com.dezzapps.collapasingtoolbar.adapter.CustomAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

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
    CustomAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       setToolbar();
       setFloatingActionButtom();




       recyclerView = findViewById(R.id.recycler);

        List<Cheese> cheeses = createCheeses();
        adapter = new CustomAdapter(cheeses);

        recyclerView.setLayoutManager(new LinearLayoutManager((this)));

        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new ItemDivider(this, R.drawable.item_divider));
        recyclerView.setHasFixedSize(true);

        boolean iWantSwipes = true;

        if(iWantSwipes){
            recyclerView.setHasFixedSize(false);
        }else {
            recyclerView.setHasFixedSize(true);
        }

        setItemTouchHelper();


    }

    private void setToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setFloatingActionButtom(){
        FloatingActionButton fab = findViewById(R.id.float_action_button);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                LayoutInflater inflater = MainActivity.this.getLayoutInflater();

                builder.setView(inflater.inflate(R.layout.checkout_dialog, null))
                        .setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Intent intent = new Intent(MainActivity.this, CheckoutActivity.class);
                                startActivity(intent);
                            }
                        }).setNegativeButton(getString(R.string.note), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(MainActivity.this, getString(R.string.cancel_buy), Toast.LENGTH_SHORT).show();

                    }
                }).create()
                        .show();

//                builder.setTitle(getString(R.string.checkout))
//                        .setMessage(getString(R.string.msg_checkout))
//                        .setIcon(R.drawable.ic_add_shopping_cart_black_24dp)
//                        .setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                        Intent intent = new Intent(MainActivity.this, CheckoutActivity.class);
//                        startActivity(intent);
//                    }
//                }).setNegativeButton(getString(R.string.note), new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                        Toast.makeText(MainActivity.this, getString(R.string.cancel_buy), Toast.LENGTH_SHORT).show();
//
//                    }
//                }).create()
//                .show();
            }
        });
    }

    private void setItemTouchHelper(){

        ItemTouchHelper.SimpleCallback callback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT ) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {


                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

                if(direction == ItemTouchHelper.LEFT){
                    Toast.makeText(MainActivity.this, "Izquierda", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Derecha", Toast.LENGTH_SHORT).show();

                }
                int position = viewHolder.getAdapterPosition();
                adapter.removeItem(position);
            }
        };

        ItemTouchHelper helper = new ItemTouchHelper(callback);
        helper.attachToRecyclerView(recyclerView);

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

