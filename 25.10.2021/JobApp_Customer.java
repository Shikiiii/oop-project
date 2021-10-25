package ООП_Проект_jobApplication;

public class JobApp_Customer {
    public String fullName;
    public String job; // Каква работа има за програмиста
    public String deadLine;
    public String price; //цена

    public JobApp_Customer(String fullName, String job, String deadLine, String price) {
        this.fullName = fullName;
        this.job = job;
        this.deadLine = deadLine;
        this.price = price;

    }
    public void printInfo() {
        System.out.println("===================================");
        System.out.println("Имена: " + this.fullName);
        System.out.println("Какви са изискаванията на клиента: " + this.job);
        System.out.println("Срок: " + this.deadLine);
        System.out.println("Цена: " + this.price);
        System.out.println("-----------------------------------");
    }
}
