/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mar20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
class Test<T>{
    T obj;
    Test(T obj){this.obj=obj;} //constructor
    
    public T getObject(){return this.obj;}
    
}
public class Mar20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
List list = new ArrayList();
list.add("Hello");
String s =(String)list.get(0);

//List<String>list = new ArrayList<String>();
//
Test<Integer>iobj = new Test<Integer>(15);
System.out.println(iobj.getObject());

Test <String>sobj= new Test<String>("bob");
System.out.println(sobj.getObject());

Test<String,Integer>jobj=new Test<String, Integer>();
    }
    
}
