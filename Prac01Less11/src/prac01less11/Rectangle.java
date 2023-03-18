/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac01less11;

/**
 *
 * @author kieut
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
       this.length = length;
       this.width = width;
    }

    //Ghi đè phương thức trừu tượng của lớp Shape
    public double area() {
       return length * width;
    }
 }            
