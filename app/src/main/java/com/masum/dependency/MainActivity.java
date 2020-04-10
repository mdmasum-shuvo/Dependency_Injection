package com.masum.dependency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private LoginViewModel loginViewModel;
    private LoginUserData loginUserData;
    private AppContainer appContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appContainer = ((MyApplication) getApplication()).appContainer;

        loginViewModel = appContainer.loginContainer.loginViewModelFactory.create();
        loginUserData = appContainer.loginContainer.loginData;

    }


    @Override
    protected void onDestroy() {
        appContainer.loginContainer = null;
        super.onDestroy();
    }
}
