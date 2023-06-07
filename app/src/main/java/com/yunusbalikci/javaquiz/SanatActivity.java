package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yunusbalikci.javaquiz.databinding.ActivityMainBinding;
import com.yunusbalikci.javaquiz.databinding.ActivitySaglikBinding;
import com.yunusbalikci.javaquiz.databinding.ActivitySanatBinding;

public class SanatActivity extends AppCompatActivity {
    private ActivitySanatBinding binding;
    Button btnclose;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySanatBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        btnclose = findViewById(R.id.button12);
        builder = new AlertDialog.Builder(this);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Uyarı!")
                        .setMessage("Yarışmayı sonlandırmak istediğinize emin misiniz?")
                        .setCancelable(true)
                        .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(),SonucActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .show();
            }
        });

        final int[] dogruCevapSayisi = {7};
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("my_preferences", Context.MODE_PRIVATE);

        binding.buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogruCevapSayisi[0]++;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("dogru_cevap_sayisi", dogruCevapSayisi[0]);
                editor.apply();
                binding.buttonC.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonB.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonC.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonB.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonC.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonB.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.buttonC.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonB.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });


        binding.imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TarihActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}