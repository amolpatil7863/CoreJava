package com.corejava.ArrayListDemo;

import java.util.HashMap;

public class HashMapDemo {

	public HashMapDemo() {
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
        
//        print(map); 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
        map.put("vaibhav", 70); 
        map.put(null, null);
        map.put(null, 9);  
        map.put(null, 9); map.put(null, 9); map.put(null, 9); 
        System.out.println("Size of map is:- " + map.size()); 
      System.out.println(map);
/*//        print(map); 
        if (map.containsKey("vishal"))  
        { 
            Integer a = map.get("vishal"); 
            System.out.println("value for key \"vishal\" is:- " + a); 
        } 
          
        map.clear(); */
	}
}
