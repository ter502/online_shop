package com.ter.online_shop.services;

import java.util.List;

import com.ter.online_shop.entity.User;

public interface UserService {
    public User save(User user);
    public List<User> findAll();
    public User findById(Integer id);
    public void deleteById(Integer id);
}
