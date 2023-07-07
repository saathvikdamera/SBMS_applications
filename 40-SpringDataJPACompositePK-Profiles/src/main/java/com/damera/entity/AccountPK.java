package com.damera.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class AccountPK implements Serializable{

	private Integer accountId;
	private Integer accountNumber;
}
