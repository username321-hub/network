package com.example.myapplication123

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PlaceHolderApi {
    @GET ("posts")
    fun getPosts(): Call<MutableList<PostItemItemX>>

    @GET ("posts/{id}")
    fun getPostFromItem(@Path("id")id:Int):Call<PostItemItemX>

}