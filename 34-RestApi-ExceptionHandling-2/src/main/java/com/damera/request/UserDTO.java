package com.damera.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserDTO {

	@NotNull(message = "Name must not be empty")
	private String userName;
	
	@NotNull(message = "Email is mandatory")
    @Email(message = "Invalid email")
	private String email;
    
    @Size(min = 10,max = 10,message = "phno must contain 10 numbers")
	private String phno;
    
    @Min(value = 18,message = "age should be 18-60")
    @Max(value = 60,message = "age should be 18-60")
	private Integer age;
}
