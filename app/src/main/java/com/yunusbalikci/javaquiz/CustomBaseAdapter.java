package com.yunusbalikci.javaquiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String listKategori[];
    int resimKategori[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String [] kategoriList,int [] kategoriResim){
        this.context = ctx;
        this.listKategori = kategoriList;
        this.resimKategori = kategoriResim;
        inflater = LayoutInflater.from(ctx);


    }

    @Override
    public int getCount() {
        return listKategori.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       convertView = inflater.inflate(R.layout.new_list,null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textView6);
        ImageView kategoriImg = (ImageView) convertView.findViewById(R.id.imageView5);
        txtView.setText(listKategori[position]);
        kategoriImg.setImageResource(resimKategori[position]);

         return convertView;
    }
}
