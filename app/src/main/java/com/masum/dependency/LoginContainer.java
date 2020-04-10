package com.masum.dependency;

public class LoginContainer {

    UserRepository userRepository;

    public LoginContainer(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public LoginUserData loginData=new LoginUserData();
    public LoginViewModelFactory loginViewModelFactory;


}
