package com.edugig.doctime.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "doctime_User_Details")
@Setter
@Getter
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer userId;

	@Column(nullable = false)
	String userName;
	@Column(nullable = false)
	String email;
	@Column(nullable = false)
	Long phoneNumber;
	@Column(nullable = false)
	String role;
	@Column(nullable = false)
	String password;

}
