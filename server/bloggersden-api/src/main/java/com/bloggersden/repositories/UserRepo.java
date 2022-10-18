package com.bloggersden.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloggersden.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
}
