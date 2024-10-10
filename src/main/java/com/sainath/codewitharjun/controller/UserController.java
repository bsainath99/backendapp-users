package com.sainath.codewitharjun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sainath.codewitharjun.exception.UserNotFoundException;
import com.sainath.codewitharjun.model.User;
import com.sainath.codewitharjun.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
@Autowired
	private UserRepository userRepository;
@PostMapping("/addUser")
User addUser(@RequestBody User newUser) {
	return userRepository.save(newUser);
}

@GetMapping("/users")
List<User> allUsers(){
	return userRepository.findAll();
}
@GetMapping("/user/{id}")
User getUserById(@PathVariable Long id) {
	return userRepository.findById(id)
			.orElseThrow(()-> new UserNotFoundException(id));
}
@PutMapping("/user/{id}")
User updateUser(@RequestBody User newUser,@PathVariable Long id) {
	return userRepository.findById(id)
			.map(user ->{
				user.setUserName(newUser.getUserName());
				user.setName(newUser.getName());
				user.setEmail(newUser.getEmail());
				return userRepository.save(user);
			}).orElseThrow(()-> new UserNotFoundException(id));
}
@DeleteMapping("/user/{id}")
String deleteUser(@PathVariable Long id) {
	if(!userRepository.existsById(id)){
		throw new UserNotFoundException(id);
	}
	userRepository.deleteById(id);
	return "User with Id: " +id+"has been deleted Successfully!!";
}
}
