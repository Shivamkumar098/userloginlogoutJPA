package com.prodapt.bootrestloginlogout.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.bootrestloginlogout.entities.UserDetails;
import com.prodapt.bootrestloginlogout.repositories.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepo;
	@Override
	public UserDetails addUser(UserDetails userDetails) {
		
		return userDetailsRepo.save( userDetails);
	}

	@Override
	public UserDetails getUserById(Long id) {
		Optional<UserDetails> userDetails = userDetailsRepo.findById(id);
		if(userDetails.isPresent()) {
			return userDetails.get();
		}
				
		return null;
	}

	@Override
	public UserDetails updateUser(UserDetails userDetails) {
		if(userDetailsRepo.existsById(userDetails.getId())) {
			userDetailsRepo.save(userDetails);
		}
		return userDetails;
	}

	@Override
	public void deleteUserById(Long id) {
		userDetailsRepo.deleteById(id);
	}

}
