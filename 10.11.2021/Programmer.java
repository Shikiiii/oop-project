package ООП_Проект_jobApplication;

public class Programmer {
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
