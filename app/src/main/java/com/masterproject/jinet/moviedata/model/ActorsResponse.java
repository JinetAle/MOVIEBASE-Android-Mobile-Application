package com.masterproject.jinet.moviedata.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ActorsResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Actor> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Actor> getResults() {
        return results;
    }

    public List<Actor> getActors() {
        return results;
    }

    public void setResults(List<Actor> results) {
        this.results = results;
    }

    public void setActors(List<Actor> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }



}