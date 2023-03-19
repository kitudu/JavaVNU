/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author kieut
 */
public class Prac03Less15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        
        for (String fruit : myList) {
            System.out.println(fruit);
        }   
        myList.add("grape");
        myList.remove("banana");
        if (myList.contains("apple")) {
            System.out.println("The list contains an apple.");
        }  
        Collections.sort(myList);
        Collections.reverse(myList);
        myList.clear();  
        for (String fruit : myList) {
            System.out.println(fruit);
        }
    }
    
}
