package com.prodapt.bootrestloginlogout.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.bootrestloginlogout.entities.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
