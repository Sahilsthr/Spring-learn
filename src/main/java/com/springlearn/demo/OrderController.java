package com.springlearn.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class OrderController {

    @GetMapping("/order")
    
    public String order(){
        return "Order Placed Successfully!";
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello sahil!";
    }
    
    @GetMapping("/learning_springboot")
    public String learning_springboot() {
        return "Learning Spring boot!";
    }
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello " + name + "!";
    }
    @GetMapping("/keseho")
    public String kesoho(@RequestParam String how) {
        return "hola amigo kese ho " + how +"!";
    }
    
    
    
    
}
