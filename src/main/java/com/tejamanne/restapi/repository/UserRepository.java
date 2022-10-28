package com.tejamanne.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tejamanne.restapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
