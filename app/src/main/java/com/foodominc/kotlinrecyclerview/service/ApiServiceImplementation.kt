package com.foodominc.kotlinrecyclerview.service

import com.foodominc.kotlinrecyclerview.model.Post
import retrofit2.Call

class ApiServiceImplementation {

    var apiService:ApiService?=null

    companion object{
        public var apiServiceImplementation:ApiServiceImplementation?=null

        fun getInstance():ApiServiceImplementation
        {
            if(apiServiceImplementation==null)
                apiServiceImplementation=ApiServiceImplementation()

           return apiServiceImplementation as ApiServiceImplementation

        }
    }


    fun getPost(): Call<List<Post>>? {
        return apiService?.getAllPosts()
    }



}