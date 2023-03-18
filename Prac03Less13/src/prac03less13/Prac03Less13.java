/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac03less13;

/**
 *
 * @author kieut
 */
public class Prac03Less13 {

    /**
     * @param args the command line arguments
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    
    public static void divideAndPrint(int a, int b) {
        try {
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void parseAndDivide() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int a = Integer.parseInt(scanner.nextLine());
            try {
                System.out.print("Enter second integer: ");
                int b = Integer.parseInt(scanner.nextLine());
                divideAndPrint(a, b);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid second integer");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid first integer");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
