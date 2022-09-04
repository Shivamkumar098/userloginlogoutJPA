package com.prodapt.bootrestloginlogout.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.bootrestloginlogout.entities.User;
import com.prodapt.bootrestloginlogout.entities.UserDetails;



@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {

	User findByEmail(String email);

}
