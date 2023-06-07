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

import com.yunusbalikci.javaquiz.databinding.ActivityBilimSoruBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityCografyaSoruBinding;

public class CografyaSoruActivity extends AppCompatActivity {
    private ActivityCografyaSoruBinding binding;
    Button btnclose;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCografyaSoruBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        btnclose = findViewById(R.id.button5);
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



        final int[] dogruCevapSayisi = {2};
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
                binding.buttonB.setBackgroundColor(Color.GREEN);
                binding.buttonA.setBackgroundColor(Color.RED);
                binding.buttonC.setBackgroundColor(Color.RED);
                binding.buttonD.setBackgroundColor(Color.RED);
            }
        });

        binding.buttonB.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(getApplicationContext(),EdebiyatActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}