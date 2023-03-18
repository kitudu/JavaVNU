/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac01less09;

/**
 *
 * @author kieut
 */
public class Prac01Less09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student obj = new Student(); 
        obj.setStdName("Kiran");           
        obj.setStdRollNo(4);           
        obj.setId(12345);

        System.out.println("Student's Name: " +obj.getStdName());           
        System.out.println("Student's Roll no.: " +obj.getStdRollNo());           
        System.out.println("Student's Id: " +obj.getStdId());    
    }
    
}
