package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.User;



@Repository("userrepository")
public interface UserRepository extends JpaRepository<User, Integer>  {
	

}
