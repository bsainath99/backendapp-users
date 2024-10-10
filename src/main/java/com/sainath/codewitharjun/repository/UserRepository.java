package com.sainath.codewitharjun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sainath.codewitharjun.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
