package com.example.demoApplication.service;

import com.example.demoApplication.model.User;
import com.example.demoApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
    public UserRepository repository;

    public void createUser(User user) {
repository.save(user);
    }

    public List<User> findAll() {
        return null;
    }

    public User updateById(Long userId, User changeduser) {
        User dbUser;
        dbUser = repository.findById(userId).orElseThrow (() >new RuntimeException("id not found"));
    dbUser.setEmail();
    User updateUser=repository.save(dbUser);
    return updateUser;
    }

    public User findById(Long userId) {
   return null;
    }
}
