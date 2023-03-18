/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac02less13;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author kieut
 */
public class Prac02Less13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            int result = Calculator.divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input!");
        } catch (DivisionByZeroException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Program complete.");
        }
        scanner.close();
    }
    
}
