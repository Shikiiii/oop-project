package ООП_Проект_jobApplication;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class JobApp_Utilities {
    //Въвеждане на данни за програмиста, който търси клиент
    public static void InputProgrammer() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Вашите имена: ");
        String input1 = scan.nextLine();
        System.out.println("Какви езици знаете? ");
        String input2 = scan.nextLine();
        System.out.println("Колко години опит като програмист имате: ");
        String input3 = scan.nextLine();
        System.out.println("Вие сте програмист от коя сфера (Web Developer, Game Developer, System Administrator, Mobile): ");

        boolean flag = true;
        while (flag) {
            String devType = scan.nextLine().toLowerCase();
            switch (devType) {
                case "web developer":
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Storage.customerStorage();
                    for (JobApp_Customer customer : Storage.customerList) {
                        if (customer.devType.equals("web")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "game developer":
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Storage.customerStorage();
                    for (JobApp_Customer customer : Storage.customerList) {
                        if (customer.devType.equals("game")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "system administrator":
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Storage.customerStorage();
                    for (JobApp_Customer customer : Storage.customerList) {
                        if (customer.devType.equals("devops")) {
                            customer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "mobile developer":
                    System.out.println("Това са клиентите подходящи за вашата сфера:");
                    Storage.customerStorage();
                    for (JobApp_Customer customer : Storage.customerList) {
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
    }

    //Въвеждане на данни за клиента, който търси програмист
    public static void InputCustomer() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);


        System.out.println("Вашите имена: ");
        String input1 = scan.nextLine();
        System.out.println("Срок(до кога да е готов проекта): ");
        String input2 = scan.nextLine();
        System.out.println("Контакт за връзка: ");
        String input3 = scan.nextLine();
        System.out.println("От какво се нуждаете?");
        String input4 = scan.nextLine();
        System.out.println("Допълнение: \n описание: Сайт-web; Игра-game; Системен андминистратор-devops; Мобилна потдръжка/мобилни игри - mobile ");

        boolean flag = true;
        while (flag) {
            String devType = scan.nextLine().toLowerCase();
            switch (devType) {
                case "web":
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Storage.programmerStorage();
                    for (JobApp_Programmer programmer : Storage.programmerList) {
                        if (programmer.devType.equals("Web Developer")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "game":
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Storage.programmerStorage();
                    for (JobApp_Programmer programmer : Storage.programmerList) {
                        if (programmer.devType.equals("Game Developer")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "devops":
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Storage.programmerStorage();
                    for (JobApp_Programmer programmer : Storage.programmerList) {
                        if (programmer.devType.equals("System Administrator")) {
                            programmer.printInfo();
                        }
                    }
                    flag = false;
                    break;
                case "mobile":
                    System.out.println("Това са наличните програмисти за вашите изисквания:");
                    Storage.programmerStorage();
                    for (JobApp_Programmer programmer : Storage.programmerList) {
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
    }
}
