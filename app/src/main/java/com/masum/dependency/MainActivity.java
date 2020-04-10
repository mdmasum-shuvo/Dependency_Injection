package com.masum.dependency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppContainer appContainer = ((MyApplication) getApplication()).appContainer;

        loginViewModel = appContainer.loginViewModelFactory.create();

    }
}
