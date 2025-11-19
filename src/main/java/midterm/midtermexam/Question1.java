/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm.midtermexam;

/**
 *
 * @author win
 */
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.println("Welcome to Simple Bank System!");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");
    System.out.println("Choose an option: ");
    
    double balance = 500;
    double option = sc.nextDouble();
    
    if (option == 1){
        System.out.println("Your current balance is: " + balance);
        
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");
    System.out.println("Choose an option: ");
    }
    
    if (option == 2){
        System.out.println("Enter amount to deposit: ");
        double deposit = sc.nextDouble();
        balance = balance + deposit;
        System.out.println(" $ " + balance + "deposited successfully." );
        
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");
    System.out.println("Choose an option: ");
    }
    
    if (option == 3){
        System.out.println("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();
        
        if (withdraw >= balance){
            balance = balance - withdraw;
            System.out.println(" $ " + withdraw + "withdrawn successfully.");

    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");
    System.out.println("Choose an option: ");
        }
        
        else if (withdraw < balance){
            System.out.println("Insufficient balance!");

    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");
    System.out.println("Choose an option: ");
    }
    }
    
    if (option == 4){
    System.out.println("Thank you for using the Simple Bank System. Goodbye!");
}       

    if (option < 1 || option > 4){
    System.out.println("Choose a right option: ");  
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");
    System.out.println("Choose an option: ");
    }
    }
    }



