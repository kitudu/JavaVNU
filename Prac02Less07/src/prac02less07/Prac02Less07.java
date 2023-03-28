/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac02less07;

/**
 *
 * @author kieut
 */
public class Prac02Less07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat cat = new Cat("Fluffy", 3, "Persian");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Breed: " + cat.getBreed());
        cat.eat();
        cat.sleep();
        cat.meow();
    }
    
}
