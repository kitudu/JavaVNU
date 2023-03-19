/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac04less15;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kieut
 */
public class Prac04Less15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Mary", 30);
        map.put("Bob", 40);
        System.out.println("Size of Map: " + map.size());
        System.out.println("Values of Map: " + map.values());
        System.out.println("Keys of Map: " + map.keySet());
        System.out.println("Map contains key John: " + map.containsKey("John"));
        System.out.println("Map contains value 30: " + map.containsValue(30));
        map.remove("Mary");
        System.out.println("Updated Map: " + map.entrySet());
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    
}
