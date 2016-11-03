package com.motionlaboratory.latihan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.motionlaboratory.latihan.adapter.MyAdapter;
import com.motionlaboratory.latihan.model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class ScrollingActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String url = getIntent().getStringExtra("url");
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        for (int i = 0; i < 5; i++ ){
            mahasiswaList.add(new Mahasiswa("1301154646", "Dani agung", "Jlan Cendrawasih", url, "Me is me"));
        }
        MyAdapter myAdapter = new MyAdapter(ScrollingActivity.this, mahasiswaList);

        recyclerView = (RecyclerView) findViewById(R.id.content_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(ScrollingActivity. this));
        recyclerView.setAdapter(myAdapter);

    }
}
