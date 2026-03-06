package com.mycompany.gradesystemstudent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class studentGradeSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== STUDENT GRADE SYSTEM ===");

        System.out.print("Masukkan Student ID: ");
        String id = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String name = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int age = input.nextInt();

        Student student = new Student(id, name, age);

        System.out.print("Berapa jumlah mata pelajaran? ");
        int jumlah = input.nextInt();
        input.nextLine();

        Grade[] grades = new Grade[jumlah];

        for(int i = 0; i < jumlah; i++){

            System.out.println("\nMata Pelajaran ke-" + (i+1));

            System.out.print("Nama Subject: ");
            String subject = input.nextLine();

            System.out.print("Nilai: ");
            double score = input.nextDouble();
            input.nextLine();

            grades[i] = new Grade(subject, score);
        }

        double total = 0;

        for(int i = 0; i < grades.length; i++){
            total += grades[i].getScore();
        }

        double average = total / grades.length;

        System.out.println("\n=== DATA STUDENT ===");
        System.out.println("ID   : " + student.getStudentId());
        System.out.println("Nama : " + student.getName());
        System.out.println("Umur : " + student.getAge());

        System.out.println("\n=== NILAI ===");

        for(int i = 0; i < grades.length; i++){
            System.out.println(grades[i].getSubject() + " : " + grades[i].getScore());
        }

        System.out.println("\nRata-rata nilai: " + average);

    }
}