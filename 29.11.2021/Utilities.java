package ООП_Проект_jobApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utilities {
    //Въвеждане на данни за програмиста, който търси клиент
    public static void InputProgrammer() throws IOException {
        Scanner scan = new Scanner(System.in);

        FileWriter myWriter = new FileWriter("E:\\18129\\src\\ООП_Проект_jobApplication\\programmer.txt", true);
        PrintWriter out = new PrintWriter(myWriter);

        System.out.println("Вашите имена:");
        out.print("\n" + scan.nextLine() + "|");
        System.out.println("На каква възраст сте?");
        while (true) {
            try {
                out.print(Integer.parseInt(scan.nextLine()) + "|");
                break;
            } catch (Exception e) {
                System.out.println("Моля въведете число!");
            }
        }
        System.out.println("Какви езици знаете?");
        out.print(scan.nextLine() + "|");
        System.out.println("Колко години опит като програмист имате:");
        out.print(scan.nextLine() + "|");
        System.out.println("Вие сте програмист от коя сфера (Web Developer(1), Game Developer(2), System Administrator(3), Mobile(4)):");

        boolean flag = true;
        while (flag) {
            String devType = scan.nextLine().toLowerCase();
            switch (devType) {
                case "1":
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
            out.print(devType);
            out.close();
        }
    }

    //Въвеждане на данни за клиента, който търси програмист
    public static void InputCustomer() throws IOException {
        Scanner scan = new Scanner(System.in);

        FileWriter myWriter = new FileWriter("E:\\18129\\src\\ООП_Проект_jobApplication\\customer.txt", true);
        PrintWriter out = new PrintWriter(myWriter);

        System.out.println("Вашите имена: ");
        out.print("\n" + scan.nextLine() + "|");
        System.out.println("От какво се нуждаете?");
        out.print(scan.nextLine() + "|");
        System.out.println("Контакт за връзка: ");
        out.print(scan.nextLine() + "|");
        System.out.println("Допълнение: \n описание: Сайт-1; Игра-2; Системен андминистратор-3; Мобилна потдръжка/мобилни игри - 4 ");

        boolean flag = true;
        while (flag) {
            String devType = scan.nextLine().toLowerCase();
            switch (devType) {
                case "1":
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
            out.print(devType);
            out.close();
        }
    }
}
