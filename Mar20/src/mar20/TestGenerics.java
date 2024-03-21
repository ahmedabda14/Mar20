/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar20;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ahmed
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();
list.add("haul");
list.add("PEPE");
String s =list.get(1);
System.out.println("Elemeent is: "+s);

Iterator<String> ltr = list.iterator();

    }
    
}
