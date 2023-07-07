package com.damera.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "accounts")
@Data
public class AccountEntity {

	private String holderName;
	private String branch;
	
	@EmbeddedId
	private AccountPK id;
	
}
