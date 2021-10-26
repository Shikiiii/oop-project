package ООП_Проект_jobApplication;

import java.util.Scanner;

public class JobApp_Utilities {
    //Въвеждане на данни за програмиста, който търси клиент
    public static void InputProgrammer(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Вашите имена: ");
        String input1 = scan.nextLine();
        System.out.println("Какви езици знаете? ");
        String input2 = scan.nextLine();
        System.out.println("Колко опит като програмист имате: ");
        String input3 = scan.nextLine();
        System.out.println("Вие сте програмист от коя сфера (Web, Game, DevOps, Mobile): ");

        boolean flag = true;
        while(flag){
            String devOps = scan.nextLine().toLowerCase();
            switch (devOps){
                case "web":
                    JobApp_Customer customerWeb01 = new JobApp_Customer("Красимир Бенковски", "Искам да ми направите сайт за обувки", "Искам да е готов до 25 декември тази година", "0888888888", "Имам бюджет до 600лв.");
                    JobApp_Customer customerWeb02 = new JobApp_Customer("Иван Добрилов", "Искам сайт за запознанства", "Искам да е готов колкото може по-скоро", "0888888888", "Давам 850лв.");
                    JobApp_Customer customerWeb03 = new JobApp_Customer("Младен Найденов", "Искам професионален сайт за продажба на коли", "Нямам претенций само да е качестена работата", "0888888888", "Парите не са проблем");
                    customerWeb01.printInfo();
                    customerWeb02.printInfo();
                    customerWeb03.printInfo();
                    flag = false;
                    break;
                case "game":
                    JobApp_Customer customerGame01 = new JobApp_Customer("Васил Колев", "Искам игра подобна на CS:GO", "Ако може да е готова до 15.02.2025", "0888888888", "6000лв.");
                    JobApp_Customer customerGame02 = new JobApp_Customer("Димитар Иванов", "Искам сървър в Roblox", "до 20.01.2022", "0888888888", "Давам 150лв.");
                    JobApp_Customer customerGame3 = new JobApp_Customer("Иво Макалистар", "Искам Sandbox игра", "Да е готова до 21.06.2023", "0888888888", "Давам 650лв.");
                    customerGame01.printInfo();
                    customerGame02.printInfo();
                    customerGame3.printInfo();
                    flag = false;
                    break;
                case "devops":
                    JobApp_Customer customerDevOps01 = new JobApp_Customer("Петар Илиеж", "Трябва ми човек, който да потдържа сървърите в моята фирма", "Трябва ми чевек до 2 дни", "0888888888", "Месечна заплата от 3500лв. до 8000лв.");
                    JobApp_Customer customerDevOps02 = new JobApp_Customer("Борис Методиев", "Търсим човек за потдръжка в хостинг компания", "Трябва ми до 12 дни  ", "0888888888", "Заплата от 1050лв. до 3000лв.");
                    JobApp_Customer customerDevOps03 = new JobApp_Customer("Атанас Кръстев", "Ако се намита човек за конфигурация на машини", "Трябва ми введнага", "0888888888", "Заплащане 3000лв.");
                    customerDevOps01.printInfo();
                    customerDevOps02.printInfo();
                    customerDevOps03.printInfo();
                    flag = false;
                    break;
                case "mobile":
                    JobApp_Customer customerMobile01 = new JobApp_Customer("Богдан Димитров", "Искам да ми се върне стария софтуер на телефона", "Искам да е готов до една седмица", "0888888888", "Давам 250лв.");
                    JobApp_Customer customerMobile02 = new JobApp_Customer("Иван Иванов", "Трябва ми приложение за телефона, с което да ми пази телефонните разговори", "Ако може да е готов до месец", "0888888888", "Давам 431лв.");
                    JobApp_Customer customerMobile03 = new JobApp_Customer("Йоана Вазова", "Изтрих си важни фаилове, ако може да ми се възстановят", "Трябва ми до 2 дни", "0888888888", "Давам 150лв.");
                    customerMobile01.printInfo();
                    customerMobile02.printInfo();
                    customerMobile03.printInfo();
                    flag = false;
                    break;
                default:
                    System.out.println("Невалиден вход, моля пробвайте отново!");
            }
        }
    }
//Въвеждане на данни за клиента, който търси програмист
    public static void InputCustomer() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Вашите имена: ");
        String input1 = scan.nextLine();
        System.out.println("Срок: ");
        String input2 = scan.nextLine();
        System.out.println("Контакт ");
        String input3 = scan.nextLine();
        System.out.println("От какво се нуждаете? \n описание:сайт-web; игра-game;системен андминистратор-devops;мобилна потдръжка/мобилни игри - mobile ");

        boolean flag = true;
        while (flag){
            String devOps = scan.nextLine().toLowerCase();
            switch (devOps){
                case "web":
                    JobApp_Programmer webDev01 = new JobApp_Programmer("Кирил Методиев", 20, "Web Developer", "PHP, HTML, CSS, JavaScript", 3);
                    JobApp_Programmer webDev02 = new JobApp_Programmer("Валентин Вичев", 34, "Web Developer", "PHP, HTML, CSS, JavaScript", 13);
                    JobApp_Programmer webDev03 = new JobApp_Programmer("Виктория Гоцева", 26, "Web Developer", "PHP, HTML, CSS, JavaScript", 6);
                    webDev01.printInfo();
                    webDev02.printInfo();
                    webDev03.printInfo();
                    flag = false;
                    break;
                case "game":
                    JobApp_Programmer gameDev01 = new JobApp_Programmer("Милан Миланов ", 54, "Game Developer", "Lua, Java, C#", 36);
                    JobApp_Programmer gameDev02 = new JobApp_Programmer("Росен Стефанов", 31, "Game Developer", "C++, UnrealScript", 10);
                    JobApp_Programmer gameDev03 = new JobApp_Programmer("Цветан Цветанов", 23, "Game Developer", "Java, C#, UnrealScript", 4);
                    gameDev01.printInfo();
                    gameDev02.printInfo();
                    gameDev03.printInfo();
                    flag = false;
                    break;
                case "devops":
                    JobApp_Programmer devOps01 = new JobApp_Programmer("Елизабет Горанова", 25, "System Administrator", "Linux, C++", 6);
                    JobApp_Programmer devOps02 = new JobApp_Programmer("Петър Петров", 26, "System Administrator", "Linux, C++", 7);
                    JobApp_Programmer devOps03 = new JobApp_Programmer("Десислава Топузакова", 24, "System Administrator", "Linux, C++", 5);
                    devOps01.printInfo();
                    devOps02.printInfo();
                    devOps03.printInfo();
                    flag = false;
                    break;
                case "mobile":
                    JobApp_Programmer mobileDev01 = new JobApp_Programmer("Зорница Панайотова", 30, "Mobile Developer", "IOS, Android", 11);
                    JobApp_Programmer mobileDev02 = new JobApp_Programmer("Димитрина Стефанова", 22, "Mobile Developer", "IOS, Android", 3);
                    JobApp_Programmer mobileDev03 = new JobApp_Programmer("Велин Атанасов", 28, "Mobile Developer", "IOS, Android", 9);
                    mobileDev01.printInfo();
                    mobileDev02.printInfo();
                    mobileDev03.printInfo();
                    flag = false;
                    break;
                default:
                    System.out.println("Невалиден вход, моля пробвайте отново!");
            }
        }
    }
}
