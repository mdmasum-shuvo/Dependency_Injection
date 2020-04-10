package com.masum.dependency;

import retrofit2.Retrofit;

public class UserRemoteDataSource {
    private final Retrofit retrofit;

    public UserRemoteDataSource(Retrofit retrofit){
        this.retrofit=retrofit;
    }
}
