/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar20;

/**
 *
 * @author ahmed
 */
class Test<T,U>{
    T obj1;
    U obj2;
    Test(T obj1, U obj2){
        this.obj1=obj1;
    this.obj2=obj2;
    } //constructor

    
    public void print(){
    System.out.println(obj1);
        System.out.println(obj2);

    }
    
}
public class Genpart2 {
        public static void main(String[] args) {

    Test<Integer, String>obj = new Test<>(64,"MTL");
    obj.print();
        }
}
