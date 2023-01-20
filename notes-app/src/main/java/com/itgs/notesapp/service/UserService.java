package com.itgs.notesapp.service;

import com.itgs.notesapp.dto.UserDto;
import com.itgs.notesapp.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
