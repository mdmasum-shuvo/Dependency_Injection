package com.masum.dependency;

public class LoginViewModel {
    private UserRepository userRepository;

    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;

        LoginViewModelFactory loginViewModelFactory = new LoginViewModelFactory(userRepository);
    }

    public LoginUserData loginData = new LoginUserData();

    public LoginViewModelFactory loginViewModelFactory;

}
