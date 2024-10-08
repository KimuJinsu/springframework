package com.jinsu.springframe.dao;

import java.util.List;
import java.util.Optional;

import com.jinsu.springframe.domain.User;

public interface UserDao {
    void add(User user);

    Optional<User> get(String id);

    List<User> getAll();

    void deleteAll();

    int getCount();
}