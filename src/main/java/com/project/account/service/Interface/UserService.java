package com.project.account.service.Interface;

import com.project.account.entity.User;
import com.project.account.repository.Interface.UserRepository;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void setUserRepository(UserRepository userRepository);

    Optional<User> findById(long id);

    List<User> getAll();

    User save(User user);

    void deleteById(long id);
}
