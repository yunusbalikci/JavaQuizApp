package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        binding.imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GenelKulturActivity.class);
                startActivity(intent);
            }
        });
    }
}