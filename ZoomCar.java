package com.codegnan.oopexamples;
import java.util.Scanner;
public class ZoomCar {
    private String brand;
    private String model;
    private double rentPrice;

    public ZoomCar(String brand, String model, double rentPrice) {
        this.brand = brand;
        this.model = model;
        this.rentPrice = rentPrice;
    }

    public void displayCarInfo() {
        if (brand == null || brand.trim().isEmpty()) {
            System.out.println("Error: Brand cannot be empty");
            return;
        }
        if (model == null || model.trim().isEmpty()) {
            System.out.println("Error: Model cannot be empty");
            return;
        }
        if (rentPrice <= 0) {
            System.out.println("Error: Rental price must be positive");
            return;
        }

        System.out.printf("Brand: %s, Model: %s, Price per Day: %.2f%n",
                brand, model, rentPrice);
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        double price = scanner.nextDouble();

        ZoomCar car = new ZoomCar(brand, model, price);
        car.displayCarInfo();
    }
}

