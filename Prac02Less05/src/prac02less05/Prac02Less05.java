/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac02less05;

/**
 *
 * @author kieut
 */
public class Prac02Less05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1, sum = 0;
        while (x <= 10) {
            //Cộng dồn x vào sum
            sum = sum + x;

            //Gia tăng giá trị của x mỗi vòng lặp
            x++;
        }
        System.out.println("Sum: " + sum);
    }
    
}
