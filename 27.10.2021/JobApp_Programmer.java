package ООП_Проект_jobApplication;

public class JobApp_Programmer {

    String fullName;
    int age;
    String devType;  // web, game, sysadmin/devOPS
    String language; // html, css, js, php
    String experience;  // 15 години

    public JobApp_Programmer(String fullName, int age, String devType, String language, String experience) {
        this.fullName = fullName;
        this.age = age;
        this.devType = devType;
        this.language = language;
        this.experience = experience;
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
