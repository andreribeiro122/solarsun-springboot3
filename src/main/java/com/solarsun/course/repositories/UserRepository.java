package com.solarsun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solarsun.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
