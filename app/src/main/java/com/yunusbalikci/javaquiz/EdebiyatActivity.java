package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.yunusbalikci.javaquiz.databinding.ActivityEdebiyatBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityMainBinding;

public class EdebiyatActivity extends AppCompatActivity {
    private ActivityEdebiyatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEdebiyatBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        final int[] dogruCevapSayisi = {3};
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("my_preferences", Context.MODE_PRIVATE);
        binding.buttonA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogruCevapSayisi[0]++;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("dogru_cevap_sayisi", dogruCevapSayisi[0]);
                editor.apply();
                binding.buttonA5.setBackgroundColor(Color.GREEN);
                binding.buttonA4.setBackgroundColor(Color.RED);
                binding.buttonA6.setBackgroundColor(Color.RED);
                binding.buttonA7.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonA5.setBackgroundColor(Color.GREEN);
                binding.buttonA4.setBackgroundColor(Color.RED);
                binding.buttonA6.setBackgroundColor(Color.RED);
                binding.buttonA7.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonA5.setBackgroundColor(Color.GREEN);
                binding.buttonA4.setBackgroundColor(Color.RED);
                binding.buttonA6.setBackgroundColor(Color.RED);
                binding.buttonA7.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonA5.setBackgroundColor(Color.GREEN);
                binding.buttonA4.setBackgroundColor(Color.RED);
                binding.buttonA6.setBackgroundColor(Color.RED);
                binding.buttonA7.setBackgroundColor(Color.RED);
            }
        });

        binding.imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GenelKulturActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}