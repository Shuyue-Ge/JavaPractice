/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author win
 */

//override

public class PolymorphismAnimal {
    class Animal {
        void sound(){
            System.out.println("Animal makes a sound" );          
        }
    }
    
    class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Dog barks" );          
        }
    }
    
    class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("Cat meows" );          
        }
    }

}
