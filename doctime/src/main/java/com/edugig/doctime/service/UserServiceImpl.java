package com.edugig.doctime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edugig.doctime.model.UserEntity;
import com.edugig.doctime.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public UserEntity addDetails(UserEntity u) {
		return userRepo.save(u) ;
	}

	@Override
	public List<UserEntity> getDetails() {
		return userRepo.findAll();
	}

	@Override
	public UserEntity getDetailsById(Integer id) {
		return userRepo.findById(id).get();
	}

	@Override
	public UserEntity updateEmail(UserEntity u, Integer id) {
		UserEntity intoDb = getDetailsById(id);
		intoDb.setEmail(u.getEmail());
		return userRepo.save(intoDb);
	}

	@Override
	public UserEntity updatePhone(UserEntity u, Integer id) {
		UserEntity intoDb = getDetailsById(id);
		intoDb.setPhoneNumber(u.getPhoneNumber());
		return userRepo.save(intoDb);
	}

	@Override
	public UserEntity updatePassword(UserEntity u, Integer id) {
		UserEntity intoDb = getDetailsById(id);
		intoDb.setPassword(u.getPassword());
		return userRepo.save(intoDb);
	}

	@Override
	public void deleteDetails(Integer id) {
		userRepo.deleteById(id);
	}

}
