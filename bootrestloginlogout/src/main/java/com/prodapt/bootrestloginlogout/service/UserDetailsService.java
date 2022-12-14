package com.prodapt.bootrestloginlogout.service;

import com.prodapt.bootrestloginlogout.entities.UserDetails;

public interface UserDetailsService {
	//Create Role
		public UserDetails addUser(UserDetails userDetails);
		//Retrieve
		public UserDetails getUserById(Long id);
		
		//Update
		public UserDetails updateUser(UserDetails userDetails);
		
		//Delete
		public void deleteUserById(Long id);

}
