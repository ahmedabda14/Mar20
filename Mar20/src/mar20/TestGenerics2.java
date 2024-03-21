/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar20;

/**
 *
 * @author ahmed
 */


public class TestGenerics2 {
     public static <E> void printArray(E[]elements){
for(E Element: elements){
    System.out.println(Element);
}
}
        public static void main(String[] args) {
            Integer[]intArray = {10,20,30,40,50};
            Character[]charArray={'A','B','C'};
            
            System.out.println("int array: ");
            printArray(intArray);
            System.out.println("Print char array");
            printArray(charArray);
        }
        }

