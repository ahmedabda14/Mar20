/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class GenTest3 {
    public static void drawShape(List<?extends Shape>lists){
        for(Shape s:lists){
            s.draw();
        }
    }
        public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());
        
        List <Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
                list2.add(new Circle());

                drawShape(list1);
                drawShape(list2);
        }
}
    abstract class Shape{
        abstract void draw();
    }
    class Rectangle extends Shape{

        
        @Override
        void draw() {
System.out.println("draw rectangle");
        }
        
    }
    class Circle extends Shape{

        @Override
        void draw() {
            System.out.println("draw circle");

        }
        
    }

