/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac01less07;

/**
 *
 * @author kieut
 */
public class Car {
    String make;
    String model;
    int year;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void startEngine() {
        System.out.println("The " + make + " " + model + " engine is starting...");
    }
}

