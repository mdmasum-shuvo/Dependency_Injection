package com.masum.dependency;


public class LoginViewModelFactory implements Factory {

    private final UserRepository userRepository;

    public LoginViewModelFactory(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public LoginViewModel create() {
        return new LoginViewModel(userRepository);
    }
}


