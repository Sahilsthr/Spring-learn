package com.springlearn.demo;

public class studentDTO {
    private String studentName;
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
