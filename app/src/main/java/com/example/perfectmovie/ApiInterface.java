package com.example.perfectmovie;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("v2.2/films/premieres")
    Call<Premieres> getPremieres(
            @Query("year") int year,
            @Query("month") String month
    );

    @GET("v2.2/films/collections")
    Call<Collection> getCollections(
            @Query("type") String type,
            @Query("page") int page
    );

    @GET("v2.1/films/{id}")
    Call<Data> getFilmDetails(@Path("id") int filmId);

    @GET("v2.2/films/{id}/videos")
    Call<Videos> getFilmVideo(@Path("id") int filmId);

    @GET("v1/staff")
    Call<ArrayList<Staff>> getFilmStaff(@Query("filmId") int filmId);
}
