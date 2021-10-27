package ООП_Проект_jobApplication;

import java.util.Scanner;

public class JobApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Здравейте! Добре дошли в апликацията за откриване на програмист или клиент.");
        System.out.println("Какво търсите?");
        System.out.println("Търся програмист, за да ми свърши работа - 1");
        System.out.println("Търся клиент на когото да свърша работа - 2");
        boolean flag = true;
        while (flag){
            String input = scan.nextLine();
            switch (input){
                case "1":
                    JobApp_Utilities.InputCustomer();
                    flag = false;
                    break;
                case "2":
                    JobApp_Utilities.InputProgrammer();
                    flag = false;
                    break;
                default:
                    System.out.println("Невалиден вход, моля пробвайте отново!");
            }
        }
    }
}
