package com.example.demoApplication.repository;

import com.example.demoApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

//public void createUser(){}
}
