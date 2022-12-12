package com.codegym.model.service;

import com.codegym.dao.UserDao;
import com.codegym.dto.UserDto;
import org.mindrot.jbcrypt.BCrypt;

public class AuthService {

    private UserDao userDao = null;

    public AuthService () {
        userDao = new UserDao();
    }

    public UserDto login(String email, String password) {
        UserDto userDto = userDao.get(email);
        boolean isCorrectPassword;
        if (userDto == null) {
            return null;
        } else {
            isCorrectPassword = BCrypt.checkpw(password, userDto.getPassword());
            if (isCorrectPassword) {
                return userDto;
            } else {
                return null;
            }
        }
    }
}
