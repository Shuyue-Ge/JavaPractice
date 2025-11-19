/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter9Lab;

/**
 *
 * @author win
 */

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println(make + " " + model + " starts normally.");
    }

    public void stop() {
        System.out.println(make + " " + model + " stops normally.");
    }
}

class Car extends Vehicle {
    int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void start() {
        System.out.println(make + " " + model + " (Car) starts with a key.");
    }
}

class Truck extends Vehicle {
    double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void start() {
        System.out.println(make + " " + model + " (Truck) rumbles to start with heavy power.");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String make, String model, int year, int numDoors, int batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void start() {
        System.out.println(make + " " + model + " (ElectricCar) starts silently.");
    }

    public void stop() {
        System.out.println(make + " " + model + " (ElectricCar) stops with regenerative braking.");
    }
}

public class Lab2 {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("Toyota", "Camry", 2020, 4);
        vehicles[1] = new Truck("Ford", "F-150", 2018, 1200.5);
        vehicles[2] = new ElectricCar("Tesla", "Model 3", 2023, 4, 75);

        for (Vehicle v : vehicles) {
            v.start();
            v.stop();
            System.out.println();
        }
    }
}
