/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vn.edu.vnu.java.prac02less03;

import java.util.Scanner;

/**
 *
 * @author kieut
 */
public class Prac02Less03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
