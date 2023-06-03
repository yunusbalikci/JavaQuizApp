package com.yunusbalikci.javaquiz;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView3;
    TextView textView7;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView3 = itemView.findViewById(R.id.imageView3);
        textView7 = itemView.findViewById(R.id.textView7);
    }
}
