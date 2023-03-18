/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac01less11;

/**
 *
 * @author kieut
 */
public abstract class Shape {
    //Phương thức trừu tượng (Không có phần thân)
    public abstract double area();

    //Phương thức thông thường
    public void display() {
       System.out.println("This is a shape.");
    }
 }       
