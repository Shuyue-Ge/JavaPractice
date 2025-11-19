/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter9Lab;

/**
 *
 * @author win
 */


class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println(name + " | ID: " + id + " | Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {
    String benefits;
    double bonus;

    public FullTimeEmployee(String name, int id, double salary, String benefits, double bonus) {
        super(name, id, salary);
        this.benefits = benefits;
        this.bonus = bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hours;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hours) {
        super(name, id, hourlyRate * hours);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
}

class Manager extends FullTimeEmployee {
    String department;

    public Manager(String name, int id, double salary, String benefits, double bonus, String department) {
        super(name, id, salary, benefits, bonus);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println(name + " | ID: " + id + " | Salary: " + salary + " | Dept: " + department);
    }
}

public class Lab1 {
    public static void main(String[] args) {
        Employee e = new Employee("Alex", 1, 40000);
        FullTimeEmployee f = new FullTimeEmployee("Emily", 2, 50000, "Health", 3000);
        PartTimeEmployee p = new PartTimeEmployee("John", 3, 20, 25);
        Manager m = new Manager("Sophia", 4, 80000, "Full Benefits", 10000, "IT");

        e.displayDetails();
        f.displayDetails();
        p.displayDetails();
        m.displayDetails();  
    }
}