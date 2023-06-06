package com.yunusbalikci.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yunusbalikci.javaquiz.databinding.ActivitySonucBinding;
import com.yunusbalikci.javaquiz.databinding.ActivityTarihBinding;

public class SonucActivity extends AppCompatActivity {
    public ActivitySonucBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySonucBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        SharedPreferences sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);
       // String buttonText = sharedPreferences.getString("button_text", "");
        int dogruCevapSayisi = sharedPreferences.getInt("dogru_cevap_sayisi", 0);
        TextView dogruCevapSayisiTextView = findViewById(R.id.dogruCevapSayisiTextView);
        dogruCevapSayisiTextView.setText("Doğru Cevap Sayısı: " + dogruCevapSayisi);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("dogru_cevap_sayisi", 0); // Doğru cevap sayısını sıfırla
                editor.apply();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

       // TextView textView = findViewById(R.id.textView18);
       // textView.setText(buttonText);

    }



}