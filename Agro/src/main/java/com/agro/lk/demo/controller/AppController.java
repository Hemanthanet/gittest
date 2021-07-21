package com.agro.lk.demo.controller;

import com.agro.lk.demo.repository.UserRepository;
import com.agro.lk.demo.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppController {



    //login page controller for viewing the different login page

    @Controller
    public class CommonController {
        @GetMapping("/login")
        public String viewLoginPage() {
            // custom logic before showing login page...
            return "user/login";
        }
    }

    @Autowired
    private UserRepository userRepo;

    @GetMapping("")
    public String viewHomePage()
    {
        return "index";
    }

    //show registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "user/signup_form";
    }

    //show precess after the register

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "user/user_success";
    }

    //logout

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "user/user";
    }

}
