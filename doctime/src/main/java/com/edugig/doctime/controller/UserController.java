package com.edugig.doctime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edugig.doctime.model.UserEntity;
import com.edugig.doctime.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	UserEntity addDetails(@RequestBody UserEntity u) {
		return userService.addDetails(u);
	}
	
	@GetMapping("/get")
	List<UserEntity> getDetails(){
		return userService.getDetails();
	}
	
	@PatchMapping("/update/{id}")
	UserEntity updateemail(@RequestBody UserEntity u, @PathVariable Integer id) {
		return userService.updatePassword(u, id);
	}
	
	@PatchMapping("/update/{id}")
	UserEntity updatePhone(@RequestBody UserEntity u,@PathVariable Integer id) {
		return userService.updatePhone(u, id);
	}
	
	@PatchMapping("/update/{id}")
	UserEntity updatePassword(@RequestBody UserEntity u,@PathVariable Integer id) {
		return userService.updatePassword(u, id);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteDetails(@PathVariable Integer id) {
		userService.deleteDetails(id);
		return id + " deleted";
	}
	
}
