package com.masum.dependency;

import retrofit2.Retrofit;

public class AppContainer {


    Retrofit retrofit = new Retrofit.Builder().
            baseUrl("http://example.com").
            build().create(Retrofit.class);

    private UserLocalDataSource userLocalDataSource = new UserLocalDataSource();
    private UserRemoteDataSource userRemoteDataSource = new UserRemoteDataSource(retrofit);

    public UserRepository userRepository = new UserRepository(userLocalDataSource, userRemoteDataSource);

    public LoginContainer loginContainer;
}
