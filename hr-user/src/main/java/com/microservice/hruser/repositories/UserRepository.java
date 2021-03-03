package com.microservice.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	//named query
	User findByEmail(String email);
	
}
