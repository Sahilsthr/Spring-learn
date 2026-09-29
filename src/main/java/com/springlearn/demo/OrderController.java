package com.springlearn.demo;




import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;



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
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        return ResponseEntity
                            .status(201)
                            .body("Hello " + student.getStudentName() + ", EnrollmentNo: " + student.getEnrollment());
    }   
    @PutMapping("/student/enrollment/{Enrollment}")
    public String putEnrollment(@PathVariable int Enrollment) {
        
        return "Student " + Enrollment + " updated!";
    }
    @PutMapping("student/name/{studentName}")
    public String putStudentName(@PathVariable String studentName){
        return "Hello " + studentName;
    }
    @PutMapping("student/{Enrollment}")
    public String updateStudent(@PathVariable int Enrollment, @RequestBody Student student) {
        
        return "Student " + student.getStudentName() + ", EnrollmentNo: " + student.getEnrollment();
    }

    @DeleteMapping("/student/{Enrollment}")
    public String deleteStudent(@PathVariable int Enrollment){

        return "Student " + Enrollment + " deleted!";

    }

    //ResponseEntity
    @GetMapping("/student")
    public ResponseEntity<String> getStudent(){
        return ResponseEntity.ok("student found!");
    }

   @GetMapping("/student/{id}")
    public ResponseEntity<String> studEntity(@PathVariable int id) {

        if (id == 1) {
            return ResponseEntity.ok("Student found!");
        }
        

        // return ResponseEntity.notFound().build();
        return ResponseEntity.status(404).body("Not Found!");
    }
    @GetMapping("/student/dto")
    public ResponseEntity<studentDTO>  getStudentDTO(){
        studentDTO student = new studentDTO();
        student.setEnrollment(1234);
        student.setStudentName("Sahil Suthar");

        return ResponseEntity.ok(student);

    }
    @PostMapping("student/dto")
    public ResponseEntity<Student> addStudent(@Valid @RequestBody studentDTO dto) {
        Student student = new Student();
        student.setEnrollment(dto.getEnrollment());
        student.setStudentName(dto.getStudentName());

        return ResponseEntity.ok(student);
    }

    
        
}
