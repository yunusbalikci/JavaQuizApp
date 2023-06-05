package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yunusbalikci.javaquiz.databinding.ActivityMainBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityTarihBinding;

public class TarihActivity extends AppCompatActivity {
    private ActivityTarihBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTarihBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SporActivity.class);
                startActivity(intent);
            }
        });
    }
}