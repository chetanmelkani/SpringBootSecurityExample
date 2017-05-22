package com.rd22.example.service.user;

import java.util.Collection;
import java.util.Optional;

import com.rd22.example.domain.User;
import com.rd22.example.domain.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
