package com.dayanand.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dayanand.blog.entities.User;


public interface UserRepo extends JpaRepository<User, Integer>{

}
