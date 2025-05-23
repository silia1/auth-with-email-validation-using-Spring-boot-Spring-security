package com.demo.auth.user;

import com.demo.auth.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;


public interface IUserService {
    List<User> getUsers();
    User registerUser(RegistrationRequest request);
    Optional<User> findByEmail(String email);

    void saveUserVerificationToken(User theUser, String verificationToken);

    String validateToken(String theToken);
}
