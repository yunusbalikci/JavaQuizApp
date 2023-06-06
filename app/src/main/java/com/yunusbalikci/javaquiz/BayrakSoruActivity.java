package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yunusbalikci.javaquiz.databinding.ActivityBayrakSoruBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityMainBinding;

public class BayrakSoruActivity extends AppCompatActivity {
    private ActivityBayrakSoruBinding binding;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBayrakSoruBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        int dogruCevapSayisi = 1;

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("my_preferences",Context.MODE_PRIVATE);
        binding.buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("dogru_cevap_sayisi",dogruCevapSayisi);
                editor.apply();
                binding.buttonB.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonC.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });
        binding.buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonB.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonC.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });
        binding.buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonB.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonC.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonB.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonC.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });


        binding.imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BilimSoruActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}