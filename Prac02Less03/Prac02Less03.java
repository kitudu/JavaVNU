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
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = ++num;
        System.out.println("The value of result after pre-increment is: " + result);

        result = num++;
        System.out.println("The value of result after post-increment is: " + result);

        result = --num;
        System.out.println("The value of result after pre-decrement is: " + result);

        result = num--;
        System.out.println("The value of result after post-decrement is: " + result);
    }
}
