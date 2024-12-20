package fst_m1_java;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Green");
		hm.put(2, "Blue");
		hm.put(3, "Red");
		hm.put(4, "Yellow");
		hm.put(5, "Pink");
		
		System.out.println(hm);
				
		hm.remove(1);
		
		System.out.println(hm);
		
		if(hm.containsValue("Green")) {
			System.out.println("Green exists");
		}else {
			System.out.println("Green not exists");
		}
		
		
		//System.out.printf("Size of the map is", + hm.size());
		
		System.out.println("Number of pairs in the Map is: " + hm.size());
   
		
	}

}
