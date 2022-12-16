package com.nissan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tblUserType")

public class UserType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ut_id;
	
	private String userType;

	public UserType(String userType) {
		this.setUserType(userType);
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
