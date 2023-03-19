/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac01less15;

/**
 *
 * @author kieut
 */
public class Box<T> {
    private T value;

    public Box(T value) {
      this.value = value;
    }

    public T getValue() {
      return value;
    }

    public void setValue(T value) {
      this.value = value;
    }
    
    public void printValue() {
        System.out.println(value);
    }   
    
    public int compareTo(Box<T> otherBox) {
        T otherValue = otherBox.getValue();
        if (value instanceof Comparable && otherValue instanceof Comparable) {
          Comparable<T> valueComparable = (Comparable<T>) value;
          return valueComparable.compareTo(otherValue);
        } else {
          throw new IllegalArgumentException("Boxes contain non-comparable types");
        }
    }    
  }
