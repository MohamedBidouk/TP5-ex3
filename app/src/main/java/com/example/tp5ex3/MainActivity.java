package com.example.tp5ex3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    RecyclerView.LayoutManager layoutManger;
    RecyclerViewAdapter recyclerViewAdapter;
    int []arr={R.drawable.haha,R.drawable.droid,R.drawable.kab,R.drawable.robot,R.drawable.kab,R.drawable.haha};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recycler);
        layoutManger= new GridLayoutManager( this,2);
        recycler.setLayoutManager(layoutManger);
        recyclerViewAdapter=new RecyclerViewAdapter(arr);
        recycler.setAdapter(recyclerViewAdapter);
        recycler.setHasFixedSize(true);
    }
}