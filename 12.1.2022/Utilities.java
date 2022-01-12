package ООП_Проект_jobApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utilities {
    //Въвеждане на данни за програмиста, който търси клиент
    public static void inputProgrammer() throws IOException {
        Scanner scan = new Scanner(System.in);

        FileWriter myWriter = new FileWriter("E:\\18129\\src\\ООП_Проект_jobApplication\\programmer.txt", true);
        PrintWriter file = new PrintWriter(myWriter); //Обект, за да записване във файла

        System.out.println("Вашите имена:");
        file.print("\n" + scan.nextLine() + "|"); // Записване във файла
        System.out.println("На каква възраст сте?");
        while (true) {
            try {
                file.print(Integer.parseInt(scan.nextLine()) + "|"); // Проверка дали входа е число
                break;
            } catch (Exception e) {
                System.out.println("Моля въведете число!");
            }
        }
        System.out.println("Какви езици знаете?");
        file.print(scan.nextLine() + "|");
        System.out.println("Колко години опит като програмист имате:");
        file.print(scan.nextLine() + "|");
        System.out.println("Вие сте програмист от коя сфера (Web Developer(1), Game Developer(2), System Administrator(3), Mobile(4)):");

        String devType = "";

        boolean flag = true;
        while (flag) {
            devType = scan.nextLine();
            switch (devType) {
                case "1":
                    devType = "Web Developer";
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Customer.customerStorage();
                    for (Customer customer : Customer.customerList) {
                        if (customer.devType.equals("web")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "2":
                    devType = "Game Developer";
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Customer.customerStorage();
                    for (Customer customer : Customer.customerList) {
                        if (customer.devType.equals("game")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "3":
                    devType = "System Administrator";
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Customer.customerStorage();
                    for (Customer customer : Customer.customerList) {
                        if (customer.devType.equals("devops")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "4":
                    devType = "Mobile Developer";
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Customer.customerStorage();
                    for (Customer customer : Customer.customerList) {
                        if (customer.devType.equals("mobile")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Невалиден вход, моля пробвайте отново!(Проверете за правопис и интервали!)");
            }
        }
        file.print(devType);
        file.close();
    }

    //Въвеждане на данни за клиента, който търси програмист
    public static void inputCustomer() throws IOException {
        Scanner scan = new Scanner(System.in);

        FileWriter myWriter = new FileWriter("E:\\18129\\src\\ООП_Проект_jobApplication\\customer.txt", true);
        PrintWriter file = new PrintWriter(myWriter);

        System.out.println("Вашите имена: ");
        file.print("\n" + scan.nextLine() + "|");
        System.out.println("От какво се нуждаете?");
        file.print(scan.nextLine() + "|");
        System.out.println("Контакт за връзка: ");
        file.print(scan.nextLine() + "|");
        System.out.println("Допълнение: \n описание: Сайт-1; Игра-2; Системен андминистратор-3; Мобилна потдръжка/мобилни игри - 4 ");

        String devType = "";

        boolean flag = true;
        while (flag) {
            devType = scan.nextLine();
            switch (devType) {
                case "1":
                    devType = "web";
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Programmer.programmerStorage();
                    for (Programmer programmer : Programmer.programmerList) {
                        if (programmer.devType.equals("Web Developer")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "2":
                    devType = "game";
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Programmer.programmerStorage();
                    for (Programmer programmer : Programmer.programmerList) {
                        if (programmer.devType.equals("Game Developer")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "3":
                    devType = "devops";
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Programmer.programmerStorage();
                    for (Programmer programmer : Programmer.programmerList) {
                        if (programmer.devType.equals("System Administrator")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "4":
                    devType = "mobile";
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Programmer.programmerStorage();
                    for (Programmer programmer : Programmer.programmerList) {
                        if (programmer.devType.equals("Mobile Developer")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Невалиден вход, моля пробвайте отново!");
            }
        }
        file.print(devType);
        file.close();
    }
}
