package ООП_Проект_jobApplication;

public class Customer {
    public String fullName;
    public String job; // Каква работа има за програмиста
    public String deadLine;
    public String contact;
    public String price; //цена
    public String devType;

    public Customer(String fullName, String job, String deadLine, String contact, String price, String devType) {
        this.fullName = fullName;
        this.job = job;
        this.deadLine = deadLine;
        this.contact = contact;
        this.price = price;
        this.devType = devType;

    }

    public void printInfo() {
        System.out.println("===================================");
        System.out.println("Имена: " + this.fullName);
        System.out.println("Какви са изискаванията на клиента: " + this.job);
        System.out.println("Срок(до кога да е готов проекта): " + this.deadLine);
        System.out.println("За контакт: " + this.contact);
        System.out.println("Цена: " + this.price);
        System.out.println("-----------------------------------");
    }
}
