package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yunusbalikci.javaquiz.databinding.ActivityBilimSoruBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityCografyaSoruBinding;

public class CografyaSoruActivity extends AppCompatActivity {
    private ActivityCografyaSoruBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCografyaSoruBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),EdebiyatActivity.class);
                startActivity(intent);
            }
        });
    }
}