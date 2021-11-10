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
        out.print(Integer.parseInt(scan.nextLine()) + "|");
        System.out.println("Какви езици знаете?");
        out.print(scan.nextLine() + "|");
        System.out.println("Колко години опит като програмист имате:");
        out.print(scan.nextLine() + "|");
        System.out.println("Вие сте програмист от коя сфера (Web Developer, Game Developer, System Administrator, Mobile):");

        boolean flag = true;
        while (flag) {
            String devType = scan.nextLine().toLowerCase();
            switch (devType) {
                case "web developer":
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Storage.customerStorage();
                    for (Customer customer : Storage.customerList) {
                        if (customer.devType.equals("web")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "game developer":
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Storage.customerStorage();
                    for (Customer customer : Storage.customerList) {
                        if (customer.devType.equals("game")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "system administrator":
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Storage.customerStorage();
                    for (Customer customer : Storage.customerList) {
                        if (customer.devType.equals("devops")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "mobile developer":
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Storage.customerStorage();
                    for (Customer customer : Storage.customerList) {
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
        System.out.println("Срок(до кога да е готов проекта): ");
        out.print(scan.nextLine() + "|");
        System.out.println("Контакт за връзка: ");
        out.print(scan.nextLine() + "|");
        System.out.println("С какъв бюджет разполагате?");
        out.print(scan.nextLine() + "|");
        System.out.println("Допълнение: \n описание: Сайт-web; Игра-game; Системен андминистратор-devops; Мобилна потдръжка/мобилни игри - mobile ");

        boolean flag = true;
        while (flag) {
            String devType = scan.nextLine().toLowerCase();
            switch (devType) {
                case "web":
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Storage.programmerStorage();
                    for (Programmer programmer : Storage.programmerList) {
                        if (programmer.devType.equals("Web Developer")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "game":
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Storage.programmerStorage();
                    for (Programmer programmer : Storage.programmerList) {
                        if (programmer.devType.equals("Game Developer")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "devops":
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Storage.programmerStorage();
                    for (Programmer programmer : Storage.programmerList) {
                        if (programmer.devType.equals("System Administrator")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "mobile":
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Storage.programmerStorage();
                    for (Programmer programmer : Storage.programmerList) {
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
