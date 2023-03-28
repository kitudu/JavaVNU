/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac02less07;

/**
 *
 * @author kieut
 */
public class Cat extends Animal {
    private String breed;
    
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    public void meow() {
        System.out.println("The cat is meowing.");
    }
    
    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    
}