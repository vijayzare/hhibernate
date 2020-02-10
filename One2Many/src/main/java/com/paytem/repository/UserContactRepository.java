package com.paytem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paytem.entity.UsersContact;

public interface UserContactRepository extends JpaRepository<UsersContact, Integer> {

}
