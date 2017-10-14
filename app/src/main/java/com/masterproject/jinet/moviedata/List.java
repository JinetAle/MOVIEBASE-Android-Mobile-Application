package com.masterproject.jinet.moviedata;

import android.content.Intent;
import android.os.Bundle;
import android.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends ListFragment{

    Intent i;

    String[] listitems = {
            "Popular Movies",
            "Top Rated Movies",
            "Now Playing Movies",
            "Upcoming Movies",
            "Movie Reviews",
            "Popular Actors",
    };
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listitems));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){

        switch(position){
            case 0:
                i = new Intent(getActivity(), PopularMovies.class);
                break;
            case 1:
                i = new Intent(getActivity(), TopRatedMovies.class);
                break;
            case 2:
                i = new Intent(getActivity(), NowPlayingMovies.class);
                break;
            case 3:
                i = new Intent(getActivity(), UpcomingMovies.class);
                break;
            case 4:
                i = new Intent(getActivity(), ReviewingActivity.class);
                break;
            case 5:
                i = new Intent(getActivity(), ActorsActivity.class);
                break;

        }
        startActivity(i);
    }

}