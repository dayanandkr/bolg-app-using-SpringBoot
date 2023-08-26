package com.dayanand.blog.services;

import java.util.List;

import com.dayanand.blog.entities.Post;
import com.dayanand.blog.payloads.PostDto;
import com.dayanand.blog.payloads.PostResponse;

public interface PostService {
	
	// Add Post
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//Update Post
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//Delete Post
	void deletePost(Integer postId);
	
	//Get Post
	PostDto getPostById(Integer postId);
	
	// Get All Post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//Get All post by Category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//Get All post by User
	List<PostDto> getPostByUser(Integer userId);
	
	//Search post by KeyWord
	List<PostDto> searchPost(String keyword);

}
