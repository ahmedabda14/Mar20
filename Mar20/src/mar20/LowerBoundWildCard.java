/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar20;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class LowerBoundWildCard {
    public static void addNumber(List<? super Integer> list){
        for(Object n:list){
            System.out.println(n);
        }
    }
              public static void main(String[] args) {
    List <Integer> l1 =Arrays.asList(1,2,3);          
    System.out.println("Displaying int values");
    System.out.println(l1);
    
        List <Number> l2 =Arrays.asList(2.0,2.4,3.0);          
                 System.out.println("Displaying double values");
    System.out.println(l2);
              }  
}
