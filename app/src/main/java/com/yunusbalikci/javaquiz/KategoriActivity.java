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
                    Toast.makeText(getApplicationContext(),"Soru:Resimdeki bayrak hangi ülkeye aittir? Cevap:AVUSTRALYA",Toast.LENGTH_LONG).show();
                }
                if (position == 1){
                    Toast.makeText(getApplicationContext(),"Soru:Elektrik akımını ilk kez hangi bilim insanı keşfetmiştir? Cevap:Alessandro Volta",Toast.LENGTH_LONG).show();
                }
                if (position == 2){
                    Toast.makeText(getApplicationContext(),"Soru:Dünyanın en büyük okyanusu hangisidir? Cevap:Pasifik Okyanusu",Toast.LENGTH_LONG).show();
                }
                if (position == 3){
                    Toast.makeText(getApplicationContext(),"Soru:Romeo ve Juliet'in yazarı kimdir? Cevap:William Shakespeare",Toast.LENGTH_LONG).show();
                }
                if (position == 4){
                    Toast.makeText(getApplicationContext(),"Soru:Mona Lisa tablosunun ünlü ressamı kimdir? Cevap:Leonardo da Vinci",Toast.LENGTH_LONG).show();
                }
                if (position == 5){
                    Toast.makeText(getApplicationContext(),"Soru:Smells Like Teen Spirit şarkısıyla ünlenen grunge müzik grubu hangisidir? Cevap:Nirvana",Toast.LENGTH_LONG).show();
                }
                if (position == 6){
                    Toast.makeText(getApplicationContext(),"Soru:Anemi hangi sağlık sorununu ifade eder? Cevap:Kansızlık",Toast.LENGTH_LONG).show();
                }
                if (position == 7){
                    Toast.makeText(getApplicationContext(),"Soru:Mavi Şapkalı Kız eseriyle tanınan ressam kimdir? Cevap:Frida Kahlo",Toast.LENGTH_LONG).show();
                }
                if (position == 8){
                    Toast.makeText(getApplicationContext(),"Soru:Türkiye Futbol Süper Liginde,Cumhuriyetin 100.yılında hangi takım şampiyon olmuştur? Cevap:GALATASARAY",Toast.LENGTH_LONG).show();
                }
                if (position == 9){
                    Toast.makeText(getApplicationContext(),"Soru:İstanbul'un fethi hangi tarihte gerçekleşmiştir? Cevap:1453",Toast.LENGTH_LONG).show();
                }

            }
        });

    }


}