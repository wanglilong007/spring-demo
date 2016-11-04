package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

		@Autowired
		UserRepository userRepo;
		
		
		@RequestMapping(method=RequestMethod.GET)
		public List<User> findUsers(@RequestParam("lastName") String lastName){
			return userRepo.findByLastName(lastName);
		}
		
		@RequestMapping(method=RequestMethod.POST)
		public User addUser(@RequestBody User user){
			return userRepo.save(user);
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
		public void delUser(@PathVariable long id){
			userRepo.delete(id);
		}
		
		@RequestMapping(value="/all", method=RequestMethod.GET)
		public Iterable<User> findAllUsers(){
			return userRepo.findAll();
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public User findOne(@PathVariable long id){
			return userRepo.findOne(id);
		}
}
