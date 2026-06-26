package com.springboot.demo.service.impl;

import com.springboot.demo.entity.User;
import com.springboot.demo.repository.UserRepository;
import com.springboot.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean saveUserInfo(User user) {
        return userRepository.save(user) != null;
    }
}
