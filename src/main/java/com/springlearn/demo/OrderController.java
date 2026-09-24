package com.springlearn.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @GetMapping ("/greet1/{name}")
    public String greet1(@PathVariable String name){
        return "hello " + name; 
    }
    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        return "Hello " + user.getName() + ", age: " + user.getAge();
    }
    @PostMapping("/student")
    public String createStudnet(@RequestBody Student student) {
        return "Hello " + student.getStudentName() + ", Enrollment No: " + student.getEnrollment();
    }
    
        
    
}
