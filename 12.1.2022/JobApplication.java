package ООП_Проект_jobApplication;

import java.io.IOException;
import java.util.Scanner;

public class JobApplication {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Здравейте! Добре дошли в апликацията за откриване на програмист или клиент.");
        System.out.println("Какво търсите?");
        System.out.println("Търся програмист, за да ми свърши работа - 1");
        System.out.println("Търся клиент на когото да свърша работа - 2");
        boolean flag = true;
        while (flag) {
            String input = scan.nextLine();
            switch (input) {
                case "1":
                    Utilities.inputCustomer();
                    flag = false;
                    break;
                case "2":
                    Utilities.inputProgrammer();
                    flag = false;
                    break;
//                case "root":
//                    System.out.println("Password:");
//                    break;
                default:
                    System.out.println("Невалиден вход, моля пробвайте отново!");
            }
        }
    }
}
