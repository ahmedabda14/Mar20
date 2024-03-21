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
class Container<T>{
    T value;

public T getValue(){
return value;
}
public void setValue(T value){
    this.value=value;
}
public void show(){
    System.out.println(value.getClass().getName());
}
public void demo(ArrayList<? extends Number>obj){ }
}
public class linkedList {
                  public static void main(String[] args) {
                      Container <Integer> obj = new Container <Integer>();
                      
                      obj.value=0;
                      obj.show();
                      obj.demo(new ArrayList<Number>());
                  }
    
}
