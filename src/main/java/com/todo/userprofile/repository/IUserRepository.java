package com.todo.userprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.userprofile.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
}
