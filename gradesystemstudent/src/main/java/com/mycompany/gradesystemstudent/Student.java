package com.mycompany.gradesystemstudent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Student {
    
    private String studentId;
    private String name;
    private int age;

    // Constructor kosong
    public Student() {
    }

    // Constructor dengan parameter
    public Student(String studentId, String name, int age) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    // Setter + Validation
    public void setStudentId(String studentId) {
        if(studentId == null || studentId.isEmpty()){
            System.out.println("Student ID tidak boleh kosong");
        } else {
            this.studentId = studentId;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.length() < 2){
            System.out.println("Nama minimal 2 huruf");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 10 || age > 100){
            System.out.println("Umur tidak valid");
        } else {
            this.age = age;
        }
    }
}
