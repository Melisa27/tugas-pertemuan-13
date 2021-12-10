package com.informatika19100082.databarang.network;

import ...

 interface ApiService {
    @GET(value = "users")
    fun getUser(): Call<List<ResponseUserItem?>>
}
