package com.dayanand.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dayanand.blog.entities.Category;
import com.dayanand.blog.entities.Post;
import com.dayanand.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	
	@Query("select p from Post p where p.title like :key")
	List<Post> searchPostByTitle(@Param("key") String title); 

}
