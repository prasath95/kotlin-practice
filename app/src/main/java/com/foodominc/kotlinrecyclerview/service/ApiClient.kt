package com.foodominc.kotlinrecyclerview.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    val BASE_URL = "https://jsonplaceholder.typicode.com/"
    var RETROFIT: Retrofit? = null
    private val mInternetConnectionListener: InternetConnectionListener? = null

    fun getApiClient(): Retrofit? {
        if(RETROFIT==null)
        {


            RETROFIT = Retrofit.Builder()
                .baseUrl(BASE_URL)
                //.client(clientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }

        return RETROFIT;
    }
}