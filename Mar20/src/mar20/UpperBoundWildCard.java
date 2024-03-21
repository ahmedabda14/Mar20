/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar20;

import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
public class UpperBoundWildCard {
    public static Double add(ArrayList <?extends Number>num){
        double sum=0.0;
        for(Number n:num){
            sum = sum+n.doubleValue();
        }
        return sum;
    }
            public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<Integer>();
        l1.add(10);
                l1.add(20);
                System.out.println("Display the sum"+add(l1));
                
                ArrayList<Double> l2 = new ArrayList<Double>();
                l2.add(30.0);
                l2.add(40.0);
                System.out.println("Display the sum"+add(l2));

            }
}
