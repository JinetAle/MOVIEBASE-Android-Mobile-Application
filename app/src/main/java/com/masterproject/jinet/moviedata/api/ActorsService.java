package com.masterproject.jinet.moviedata.api;

import com.masterproject.jinet.moviedata.model.ActorsResponse;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ActorsService {

    @GET("person/popular")
    Call<ActorsResponse> getPopularActors(@Query("api_key") String apiKey);

}