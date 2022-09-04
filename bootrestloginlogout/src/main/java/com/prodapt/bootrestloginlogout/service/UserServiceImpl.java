package com.prodapt.bootrestloginlogout.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.bootrestloginlogout.entities.User;
import com.prodapt.bootrestloginlogout.exceptions.InvalidCredentialsException;
import com.prodapt.bootrestloginlogout.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User addUser(User user) {

		return userRepo.save(user);
	}

	@Override
	public User getUserByName(String userName) {

		return userRepo.findByUserName(userName);
	}

	@Override
	public User updateUser(User user) {
		if (userRepo.existsById(user.getUserId())) {
			userRepo.save(user);
		}
		return user;
	}

	@Override
	public void deleteUserById(Long id) {
		userRepo.deleteById(id);

	}

	@Override
	public User loginUser(User user) throws InvalidCredentialsException {
		User usr = userRepo.findByUserName(user.getUserName());
		if(usr!= null) {
			if(usr.getPassword().equals(user.getPassword() )) {
				
				return usr;
			}else {
				throw new InvalidCredentialsException();
			}
		}else {
			throw new InvalidCredentialsException();
		}
		
	}

}
