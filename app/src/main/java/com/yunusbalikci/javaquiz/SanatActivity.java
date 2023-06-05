package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yunusbalikci.javaquiz.databinding.ActivityMainBinding;
import com.yunusbalikci.javaquiz.databinding.ActivitySaglikBinding;
import com.yunusbalikci.javaquiz.databinding.ActivitySanatBinding;

public class SanatActivity extends AppCompatActivity {
    private ActivitySanatBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySanatBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TarihActivity.class);
                startActivity(intent);
            }
        });
    }
}