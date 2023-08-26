package com.dayanand.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dayanand.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
