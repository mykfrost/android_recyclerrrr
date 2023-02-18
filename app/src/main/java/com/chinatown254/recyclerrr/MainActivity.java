package com.chinatown254.recyclerrr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userlist;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();
    }

    private void initData() {
        userlist = new ArrayList<>();
        userlist.add(new ModelClass(R.drawable.one ,"Mike Frost " , "12:00PM" ,"Hello Michael","_________"));
        userlist.add(new ModelClass(R.drawable.two ,"Skylar Frost " , "12:00PM" ,"Hello Michael","_________"));
        userlist.add(new ModelClass(R.drawable.three ,"Loise Frost " , "12:03PM" ,"Hello Michael","_________"));
        userlist.add(new ModelClass(R.drawable.one ,"Kevin Frost " , "12:05PM" ,"Hello Michael","_________"));
        userlist.add(new ModelClass(R.drawable.one ,"Luke Frost " , "12:07PM" ,"Hello Michael","_________"));
        userlist.add(new ModelClass(R.drawable.one ,"Jake Frost " , "12:12PM" ,"Hello Michael","_________"));

    }

    private void initRecyclerView() {
       recyclerView = findViewById(R.id.recycler);
       layoutManager = new LinearLayoutManager(this);
       layoutManager.setOrientation(RecyclerView.VERTICAL);
       recyclerView.setLayoutManager(layoutManager);
       adapter = new Adapter(userlist);
       recyclerView.setAdapter(adapter);
       adapter.notifyDataSetChanged();
    }
}