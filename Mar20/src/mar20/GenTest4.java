/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ahmed
 */
public class GenTest4 {
        public static void main(String[] args) {
            Map<Integer,String> map = new HashMap<Integer,String>();
            map.put(1,"viv");
            map.put(4, "ume");
            map.put(2, "ank");
            
            Set <Map.Entry<Integer,String>>set=map.entrySet();
            Iterator<Map.Entry<Integer,String>>itr=set.iterator();
            while(itr.hasNext()){
                Map.Entry e =itr.next();
                System.out.println(e.getKey()+" "+e.getValue());
            }
        }
}
