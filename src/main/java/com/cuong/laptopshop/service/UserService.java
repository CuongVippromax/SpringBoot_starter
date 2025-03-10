package com.cuong.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cuong.laptopshop.domain.User;
import com.cuong.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository ;

    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }
    public List<User> getAllUsersbyEmail(String email){
        return this.userRepository.findAll();
    }
    public String handleHello(){
        return "Hello from Service" ;
    }
    public User handleSaveUser(UserService user){
        return this.userRepository.save(null);
    }
    
}
 