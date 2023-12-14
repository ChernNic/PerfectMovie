package com.example.perfectmovie;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PremierAdapter extends RecyclerView.Adapter<PremierAdapter.ViewHolder>{

    private Context context;
    private ArrayList<Premieres.Premier> list;
    private Activity activity;

    public PremierAdapter(Context context, ArrayList<Premieres.Premier> list, Activity activity) {
        this.context = context;
        this.list = list;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.premier_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Premieres.Premier premier = list.get(position);
        holder.title_textView.setText(premier.getNameRu());

        for (Premieres.Genre genre : premier.getGenres() ){
            holder.description_textView.append(genre.genre + ", ");
        }
        holder.date_textView.setText("Год: " + premier.getYear());
        Picasso.with(context).load(premier.getPosterUrl()).into(holder.imageView);
        int id = premier.getKinopoiskId();


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, FilmDataActivity.class);
                intent.putExtra("id", id);
                activity.startActivity(intent);
            }
        });

        setAnimation(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private int lastPosition = -1;

    private void setAnimation(View view, int position) {
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.rotate);
            view.startAnimation(animation);
            lastPosition = position;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title_textView;
        TextView description_textView;
        TextView date_textView;
        ImageView imageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.cover_imageView);
            title_textView = itemView.findViewById(R.id.title_TextView);
            description_textView = itemView.findViewById(R.id.description_TextView);
            date_textView = itemView.findViewById(R.id.date_TextView);
        }
    }
}
