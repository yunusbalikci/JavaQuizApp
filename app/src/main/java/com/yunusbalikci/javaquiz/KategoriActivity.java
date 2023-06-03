package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class KategoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("BAYRAKLAR",R.drawable.bayrak));
        items.add(new Item("SPOR",R.drawable.spor));
        items.add(new Item("BİLİM",R.drawable.bilim));
        items.add(new Item("COĞRAFYA",R.drawable.cografya));
        items.add(new Item("EDEBİYAT",R.drawable.edebiyat));
        items.add(new Item("GENEL KÜLTÜR",R.drawable.genelkultur));
        items.add(new Item("MÜZİK",R.drawable.music));
        items.add(new Item("SAĞLIK",R.drawable.saglik));
        items.add(new Item("SANAT",R.drawable.sanat));
        items.add(new Item("TARİH",R.drawable.tarih));


        RecyclerView recyclerView = findViewById(R.id.mRecycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }

}