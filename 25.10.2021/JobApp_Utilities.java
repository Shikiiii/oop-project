package ООП_Проект_jobApplication;

import java.util.Locale;
import java.util.Scanner;

public class JobApp_Utilities {
    public static void Input(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Вашите имена: ");
        String input1 = scan.nextLine();
        System.out.println("Вие сте програмист от коя сфера (Web, Game, DevOps, Mobile): ");
        String devOps = scan.nextLine().toLowerCase();
        System.out.println("Какви езици знаете? ");
        String input2 = scan.nextLine();
        System.out.println("Колко опит като програмист имате: ");
        String input3 = scan.nextLine();


       switch (devOps){
           case "web":
               JobApp_Customer customerWeb01 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               JobApp_Customer customerWeb02 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               JobApp_Customer customerWeb03 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               customerWeb01.printInfo();
               customerWeb02.printInfo();
               customerWeb03.printInfo();
               break;
           case "game":
               JobApp_Customer customerGame01 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               JobApp_Customer customerGame02 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е гоdв до 25 декември", "Давам 650лв.");
               JobApp_Customer customerGame3 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               break;
           case "devops":
               JobApp_Customer customerDevOps01 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               JobApp_Customer customerDevOps02 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да aготов до 25 декември", "Давам 650лв.");
               JobApp_Customer customerDevOps03 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               break;
           case "mobile":
               JobApp_Customer customerMobile01 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да dготов до 25 декември", "Давам 650лв.");
               JobApp_Customer customerMobile02 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               JobApp_Customer customerMobile03 = new JobApp_Customer("Ivan Ivanov", "Искам сайт", "Искам да е готов до 25 декември", "Давам 650лв.");
               break;
       }

    }
}
