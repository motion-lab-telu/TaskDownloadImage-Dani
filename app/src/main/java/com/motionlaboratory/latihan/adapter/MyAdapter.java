package com.motionlaboratory.latihan.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.motionlaboratory.latihan.DetailActivity;
import com.motionlaboratory.latihan.R;
import com.motionlaboratory.latihan.model.Mahasiswa;

import java.util.List;

/**
 * Created by MOTION-3 on 27/10/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    Context context;
    List <Mahasiswa> mahasiswaList;

    public MyAdapter(Context context, List<Mahasiswa> mahasiswaList) {
        this.context = context;
        this.mahasiswaList = mahasiswaList;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView personImage;
        TextView personName;
        TextView personQuote;

        public ViewHolder(View itemView) {
            super (itemView);
            personImage= (ImageView) itemView.findViewById(R.id.person_image);
            personName = (TextView) itemView.findViewById(R.id.person_nama);
            personQuote = (TextView) itemView.findViewById(R.id.person_quote);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(context).inflate(R.layout.content_scrolling, parent, false);
        ViewHolder viewHolder = new ViewHolder(layout);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Mahasiswa data = mahasiswaList.get(position);
        holder.personName.setText(data.getNama());
        holder.personQuote.setText(data.getQuote());
        Glide.with(context).load(data.getFoto()).centerCrop().into(holder.personImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(context, DetailActivity.class);
                move.putExtra("nama", data.getNama());
                context.startActivity(move);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mahasiswaList.size();
    }
}
