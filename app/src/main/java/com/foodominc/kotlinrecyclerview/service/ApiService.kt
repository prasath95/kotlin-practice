package com.foodominc.kotlinrecyclerview.service

import com.foodominc.kotlinrecyclerview.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    /*
    * get posts from https://jsonplaceholder.typicode.com/posts
    * */
    @GET("/posts")
    fun getAllPosts():Call<List<Post>>
}