package com.masum.dependency;

public class LoginViewModel {
    private UserRepository userRepository;

    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
