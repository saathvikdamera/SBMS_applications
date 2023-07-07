package com.damera.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class UserDtls {

	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String email;
	private String phno;
	private Integer age;
}
