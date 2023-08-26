package com.dayanand.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private Integer categoryId;
	
	@NotEmpty
	@Size(min = 4, max = 100, message = "Category Title must be between 4 and 100 Characters !!")
	private String categoryTitle;
	
	@NotEmpty
	@Size(min = 10, max = 500, message = "Category Title must be between 10 and 500 Characters !!")
	private String categoryDescription;

}
