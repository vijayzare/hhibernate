package com.paytem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.paytem.entity.Users;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);

}
