package com.masterproject.jinet.moviedata.model;

import android.widget.ListView;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class TrailerResponse {

    @SerializedName("id")
    private int id_trailer;
    @SerializedName("results")
    private List<Trailer> results;

    public int getIdtrailer(){
        return id_trailer;
    }

    public void setIdtrailer(int id_trailer){
        this.id_trailer = id_trailer;
    }

    public List<Trailer> getResults(){
        return results;
    }


}
