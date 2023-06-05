package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yunusbalikci.javaquiz.databinding.ActivityBilimSoruBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityMainBinding;

public class BilimSoruActivity extends AppCompatActivity {
    private ActivityBilimSoruBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBilimSoruBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CografyaSoruActivity.class);
                startActivity(intent);
            }
        });
    }
}