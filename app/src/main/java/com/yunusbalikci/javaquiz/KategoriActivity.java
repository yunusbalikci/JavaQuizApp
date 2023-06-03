package com.yunusbalikci.javaquiz;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class KategoriActivity extends AppCompatActivity {


    String kategoriList[] = {"BAYRAK","BİLİM","COĞRAFYA","EDEBİYAT","GENEL KÜLTÜR","MÜZİK","SAĞLIK","SANAT","SPOR","TARİH"};
    int kategoriResim[] = {R.drawable.bayrak,R.drawable.bilim,R.drawable.cografya,R.drawable.edebiyat,R.drawable.genelkultur,R.drawable.music,R.drawable.saglik,R.drawable.sanat,R.drawable.spor,R.drawable.tarih};

    ListView listView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        listView = (ListView) findViewById(R.id.listView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),kategoriList,kategoriResim);
        listView.setAdapter(customBaseAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(),BayrakSoruActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }


}