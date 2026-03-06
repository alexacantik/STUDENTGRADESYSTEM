package com.mycompany.gradesystemstudent;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Grade {
     private String subject;
    private double score;

    // Constructor kosong
    public Grade() {
    }

    // Constructor dengan parameter
    public Grade(String subject, double score) {
        setSubject(subject);
        setScore(score);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if(subject == null || subject.isEmpty()){
            System.out.println("Nama subject tidak boleh kosong");
        } else {
            this.subject = subject;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {

        // Validation nilai
        if(score < 0 || score > 100){
            System.out.println("Nilai harus antara 0 - 100");
        } else {
            this.score = score;
        }
    }
}
