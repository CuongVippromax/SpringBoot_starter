package com.cuong.laptopshop.service;

import org.springframework.stereotype.Service;

import com.cuong.laptopshop.domain.User;
import com.cuong.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository ;

    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public String handleHello(){
        return "Hello from Service" ;
    }
    public User handleSaveUser(UserService user){
        return this.userRepository.save(null);
    }
    
}
 