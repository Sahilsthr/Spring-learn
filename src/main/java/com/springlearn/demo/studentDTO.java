package com.springlearn.demo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class studentDTO {
    @NotBlank(message = "Name cannot be empty.")
    private String studentName;
    @Positive(message = "Enrollment number must be positive.")
    private int enrollment;


    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;

    }

    public int getEnrollment(){
        return enrollment;
    }

    public void setEnrollment(int enrollment){
        this.enrollment = enrollment;
    }
    
}
