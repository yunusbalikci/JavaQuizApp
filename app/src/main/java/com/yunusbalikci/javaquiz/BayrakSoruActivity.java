package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yunusbalikci.javaquiz.databinding.ActivityBayrakSoruBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityMainBinding;

public class BayrakSoruActivity extends AppCompatActivity {
    private ActivityBayrakSoruBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBayrakSoruBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BilimSoruActivity.class);
                startActivity(intent);
            }
        });

    }
}