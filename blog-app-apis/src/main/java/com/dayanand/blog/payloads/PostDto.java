package com.dayanand.blog.payloads;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {

	private Integer postId;
	
	@NotEmpty
	@Size(min = 4, max = 100, message = "Post Title must be between 4 and 100 Characters !!")
	private String title;

	@NotEmpty
	@Size(min = 10, message = "Post content must be atleast 10 Characters !!")
	private String content;

	private String imageName;

	private Date addedDate;

	private CategoryDto category;

	private UserDto user;

}
