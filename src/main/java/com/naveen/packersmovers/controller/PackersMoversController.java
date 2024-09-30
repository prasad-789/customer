package com.naveen.packersmovers.controller;

import com.naveen.packersmovers.model.Customer;
import com.naveen.packersmovers.service.PackersMoversService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class PackersMoversController {
        @Autowired
        private PackersMoversService userService;
                
           
        @PostMapping("/customerDetails")
        public String customerDetails(@RequestBody Customer customer){
            userService.saveUser(customer);
                      return "New user is added";
        }
        
        
        @GetMapping("/ping")
        public String ping() {  return "Hi this is Advaith";}             

    }
