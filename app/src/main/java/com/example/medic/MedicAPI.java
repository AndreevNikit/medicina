package com.example.medic;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface MedicAPI {

    @GET("3e036583-7a34-4e23-9ff1-7577f8a72ecf")
    Call<List<News>> getNews();

    @GET("532c2674-f536-4b93-bd65-0a51d4de174d")
    Call<List<Catalog>> getCatalog();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://run.mocky.io/v3/")
            .addConverterFactory(GsonConverterFactory.create()).build();
}
