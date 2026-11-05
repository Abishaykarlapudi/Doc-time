package com.edugig.doctime.service;

import java.util.List;

import com.edugig.doctime.model.UserEntity;

public interface UserService {

	public abstract UserEntity addDetails(UserEntity u);

	public abstract List<UserEntity> getDetails();

	public abstract UserEntity getDetailsById(Integer id);

	public abstract UserEntity updateEmail(UserEntity u, Integer id);

	public abstract UserEntity updatePhone(UserEntity u, Integer id);
	
	public abstract UserEntity updatePassword(UserEntity u , Integer id);
	
	public abstract void deleteDetails(Integer id);

}
