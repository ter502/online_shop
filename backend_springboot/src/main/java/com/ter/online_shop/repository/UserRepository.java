package com.ter.online_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ter.online_shop.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
