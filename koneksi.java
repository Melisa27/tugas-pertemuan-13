package com.informatika19100082.databarang.network;

import retrofit2.Retrofit;
 import retrofit2.converter.gson.GsonConverterFactory;

 class koneksi {
   Companion object{
      Val BaseUrl  = "https://jsonplaceholder.typicode.com/" ;
      val retrofit = Retrofit.Builder()
           .baseUrl(BaseUrl)
           .addConverterFactory(GsonConverterFactory.create())
           .build();
      Val service:ApiService = retrofit.create(ApiService::class.java)
    }
 }
