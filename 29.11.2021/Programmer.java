package ООП_Проект_jobApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programmer {
    static List<Programmer> programmerList = new ArrayList<>();
    String fullName;
    int age;
    String language; // html, css, js, php
    String experience;  // 15 години
    String devType;  // web, game, sysadmin/devOPS

    public Programmer(String fullName, int age, String language, String experience, String devType) {
        this.fullName = fullName;
        this.age = age;
        this.language = language;
        this.experience = experience;
        this.devType = devType;
    }

    public static void programmerStorage() throws FileNotFoundException {
        File myObj = new File("E:\\18129\\src\\ООП_Проект_jobApplication\\programmer.txt");
        Scanner myReader = new Scanner(myObj);


        while (myReader.hasNextLine()) {
            String[] reader = myReader.nextLine().split("\\|");
            String fullName = reader[0];
            int age = Integer.parseInt(reader[1]);
            String language = reader[2];
            String experience = reader[3];
            String devType = reader[4];

            Programmer programmer = new Programmer(fullName, age, language, experience, devType);
            programmerList.add(programmer);

        }
    }

    public void printInfo() {
        System.out.println("===================================");
        System.out.println("Имена: " + this.fullName);
        System.out.println("Възраст: " + this.age);
        System.out.println("Компетентност: " + this.devType);
        System.out.println("Езици за програмиране: " + this.language);
        System.out.println("Опит: " + this.experience);
        System.out.println("-----------------------------------");
    }
}
