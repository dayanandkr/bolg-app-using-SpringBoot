package com.dayanand.blog.services;

import java.util.List;

import com.dayanand.blog.payloads.CategoryDto;

public interface CategoryService {
	
	// Add Category
	CategoryDto  createCategory(CategoryDto categoryDto);
	
	// Update Category
	CategoryDto  updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// Delete Category
	void  deleteCategory(Integer categoryId);
	
	// Get Category
	CategoryDto  getCategory(Integer categoryId);
	
	
	// Get All Category
	List<CategoryDto> getAllCategory();

}
