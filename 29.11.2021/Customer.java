package ООП_Проект_jobApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    static List<Customer> customerList = new ArrayList<>();

    String fullName;
    String job; // Каква работа има за програмиста
    String contact;
    String devType;

    public Customer(String fullName, String job, String contact, String devType) {
        this.fullName = fullName;
        this.job = job;
        this.contact = contact;
        this.devType = devType;

    }

    public static void customerStorage() throws FileNotFoundException {
        File myObj = new File("E:\\18129\\src\\ООП_Проект_jobApplication\\customer.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String[] reader = myReader.nextLine().split("\\|");

            String fullName = reader[0];
            String job = reader[1];
            String contact = reader[2];
            String devType = reader[3];

            Customer customer = new Customer(fullName, job, contact, devType);
            customerList.add(customer);

        }
    }

    public void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println("Имена: " + this.fullName);
        System.out.println("Какви са изискаванията на клиента: " + this.job);
        System.out.println("За контакт: " + this.contact);
        System.out.println("-----------------------------------");
    }
}
