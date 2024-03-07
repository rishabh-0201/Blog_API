package com.blog.blogappapis.repositories;

import com.blog.blogappapis.entities.User;
import com.blog.blogappapis.payloads.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);

}
