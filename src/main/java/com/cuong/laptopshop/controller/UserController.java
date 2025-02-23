package com.cuong.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cuong.laptopshop.service.UserService;



import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {

    private UserService userService ;

    


    public UserController(UserService userService) {
        this.userService = userService;
    }




    @RequestMapping("/")
      
    public String getHomePage(Model model){
        String test = this.userService.handleHello();
        model.addAttribute("test",test);
        return "hello";
    }
}
// @RestController
// public class UserController {

//     // Sử dụng DI : dependency injection 
//     private UserService userService ;
    
//     public UserController(UserService userService) {
//         this.userService = userService;
//     }


//     @GetMapping("/")
//     public String getHomePage(){
//         return this.userService.handleHello();
//     }
// }
