/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vn.edu.vnu.java.prac01less03;

import java.util.Scanner;

/**
 *
 * @author kieut
 */
public class Prac01Less03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        //Phép cộng
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        //Phép trừ
        double diff = num1 - num2;
        System.out.println("The difference between " + num1 + " and " + num2 + " is " + diff);

        //Phép nhân
        double product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

        //Phép chia
        double quotient = num1 / num2;
        System.out.println("The quotient of " + num1 + " divided by " + num2 + " is " + quotient);
    }
}
