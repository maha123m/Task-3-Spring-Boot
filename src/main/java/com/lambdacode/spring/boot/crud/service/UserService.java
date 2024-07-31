package com.lambdacode.spring.boot.crud.service;

import com.lambdacode.spring.boot.crud.dto.UserDTO;
import com.lambdacode.spring.boot.crud.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    boolean updateUser(Integer id, User user);

    boolean deleteUser(Integer id);

    boolean updateName(Integer id, UserDTO userDTO);
}
