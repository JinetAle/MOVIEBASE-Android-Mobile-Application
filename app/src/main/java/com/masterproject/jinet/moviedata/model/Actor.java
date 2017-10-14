package com.masterproject.jinet.moviedata.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Actor {
    @SerializedName("profile_path")
    private String profilePath;
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("popularity")
    private Double popularity;
    public Actor(String profilePath,  String name, Integer id, Double popularity) {
        this.profilePath = profilePath;
        this.name = name;
        this.id = id;
        this.popularity = popularity;
    }
    public String getProfilePath() {
        return  profilePath;
    }
    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getPopularity() {
        return popularity;
    }
    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }




}
