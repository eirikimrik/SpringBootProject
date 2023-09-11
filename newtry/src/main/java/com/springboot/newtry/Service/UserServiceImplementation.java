package com.springboot.newtry.Service;

import com.springboot.newtry.Entity.User;
import com.springboot.newtry.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;



    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }






}
