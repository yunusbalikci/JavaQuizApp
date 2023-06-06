package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.yunusbalikci.javaquiz.databinding.ActivityGenelKulturBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityMainBinding;

public class GenelKulturActivity extends AppCompatActivity {
    private ActivityGenelKulturBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGenelKulturBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        final int[] dogruCevapSayisi = {4};
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("my_preferences", Context.MODE_PRIVATE);

        binding.buttonB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogruCevapSayisi[0]++;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("dogru_cevap_sayisi", dogruCevapSayisi[0]);
                editor.apply();

                binding.buttonB2.setBackgroundColor(Color.GREEN);
                binding.buttonA2.setBackgroundColor(Color.RED);
                binding.buttonC2.setBackgroundColor(Color.RED);
                binding.buttonD2.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonB2.setBackgroundColor(Color.GREEN);
                binding.buttonA2.setBackgroundColor(Color.RED);
                binding.buttonC2.setBackgroundColor(Color.RED);
                binding.buttonD2.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonB2.setBackgroundColor(Color.GREEN);
                binding.buttonA2.setBackgroundColor(Color.RED);
                binding.buttonC2.setBackgroundColor(Color.RED);
                binding.buttonD2.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonB2.setBackgroundColor(Color.GREEN);
                binding.buttonA2.setBackgroundColor(Color.RED);
                binding.buttonC2.setBackgroundColor(Color.RED);
                binding.buttonD2.setBackgroundColor(Color.RED);
            }
        });

        binding.imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MusicActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}