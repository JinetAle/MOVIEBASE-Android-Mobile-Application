package com.masterproject.jinet.moviedata.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.masterproject.jinet.moviedata.R;
import com.masterproject.jinet.moviedata.model.Actor;


import java.util.List;


public class ActorsAdapter extends RecyclerView.Adapter<ActorsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Actor> actorList;

    public ActorsAdapter(Context mContext, List<Actor> actorList){
        this.mContext = mContext;
        this.actorList = actorList;
    }

    @Override
    public ActorsAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.movie_card, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ActorsAdapter.MyViewHolder viewHolder, int i) {
        viewHolder.title.setText(actorList.get(i).getName());
        String vote = Double.toString(actorList.get(i).getPopularity());
        viewHolder.userrating.setText(vote);
        String poster = "https://image.tmdb.org/t/p/w500" + actorList.get(i).getProfilePath();
        Glide.with(mContext)
                .load(poster)
                .placeholder(R.drawable.load)
                .into(viewHolder.thumbnail);
    }

    @Override
    public int getItemCount(){
        return actorList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, userrating;
        public ImageView thumbnail;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            userrating = (TextView) view.findViewById(R.id.userrating);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }
}