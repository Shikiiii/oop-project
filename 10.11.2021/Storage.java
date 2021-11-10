package ООП_Проект_jobApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Storage {
    static List<Programmer> programmerList = new ArrayList<>();

    public static void programmerStorage() throws FileNotFoundException {
        File myObj = new File("E:\\18129\\src\\ООП_Проект_jobApplication\\programmer.txt");
        Scanner myReader = new Scanner(myObj);


        while (myReader.hasNextLine()) {
            String[] reader = myReader.nextLine().split("\\|");
            String fullName = reader[0];
            int age = Integer.parseInt(reader[1]);
            String language = reader[2];
            String experience = reader[3];
            String devType = reader[4];

            Programmer programmer = new Programmer(fullName, age, language, experience, devType);
            programmerList.add(programmer);

        }
    }

    static List<Customer> customerList = new ArrayList<>();

    public static void customerStorage() throws FileNotFoundException {
        File myObj = new File("E:\\18129\\src\\ООП_Проект_jobApplication\\customer.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String[] reader = myReader.nextLine().split("\\|");

            String fullName = reader[0];
            String job = reader[1];
            String deadLine = reader[2];
            String contact = reader[3];
            String price = reader[4];
            String devType = reader[5];

            Customer customer = new Customer(fullName, job, deadLine, contact, price, devType);
            customerList.add(customer);

        }
    }
}
