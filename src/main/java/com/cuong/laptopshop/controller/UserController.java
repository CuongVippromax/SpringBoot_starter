package com.cuong.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.cuong.laptopshop.domain.User;
import com.cuong.laptopshop.repository.UserRepository;
import com.cuong.laptopshop.service.UserService;




import org.springframework.web.bind.annotation.ModelAttribute;



@Controller
public class UserController {

    private UserService userService ;
    

    


    public UserController(UserService userService) {
        this.userService = userService;
        
    }




    @RequestMapping("/")
      
    public String getHomePage(Model model){
        List<User> arrUsers = this.userService.getAllUsers();
        System.out.println(arrUsers);;
        model.addAttribute("test","test");
        return "hello";
    }

    @RequestMapping("/admin/create")
    public String createUser(Model model) {
        //tạo thêm 1 attribute để nhận các giá trị của objetc User từ form create sang 
        model.addAttribute("newUser",new User()); //newUser là key , new User() là giá trị lấy từ form bên kia sang
        return "admin/user/create";
    }
    @RequestMapping(value = "/admin/user/create" ,method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User cuong) { // lấy giá trị newUser từ bên form nhập có kiểu User và tên biến là cuong
        System.out.println("run here !!!"+cuong);
        this.userService.handleSaveUser(userService);
        return "hello";
    }

}
