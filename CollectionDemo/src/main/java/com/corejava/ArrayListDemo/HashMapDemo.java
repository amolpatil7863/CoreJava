package com.corejava.ArrayListDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public HashMapDemo() {
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
        
//        print(map); 
        map.put("vishal", 14); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
        map.put("steve", 10); 
        map.put("steve", 10); 
        map.put(null, null);
        map.put(null, 9);  
        map.put(null, 9);
        map.put(null, 9); 
        map.put(null, 9); 
        System.out.println("Size of map is:- " + map.size()); 
        
        
        System.out.println("HashMap:- "+map);
      
      
        Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
       

		while (it.hasNext()) {
			Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		
		
        
      for (Entry<String, Integer> entry : map.entrySet())  
          System.out.println("Key = " + entry.getKey() + 
                           ", Value = " + entry.getValue()); 
      
      for (String name : map.keySet())  
          System.out.println("key: " + name);
     
      
      for (Integer name : map.values())  
          System.out.println("values: " + name);
	} 
	

}
