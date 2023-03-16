/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vn.edu.vnu.java.prac03less03;

import java.util.Scanner;

/**
 *
 * @author kieut
 */
public class Prac03Less03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("num1 > num2 is " + (num1 > num2));
        System.out.println("num1 < num2 is " + (num1 < num2));
        System.out.println("num1 >= num2 is " + (num1 >= num2));
        System.out.println("num1 <= num2 is " + (num1 <= num2));
        System.out.println("num1 == num2 is " + (num1 == num2));
        System.out.println("num1 != num2 is " + (num1 != num2));
    }
}
