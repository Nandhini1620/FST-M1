package fst_m1_java;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Lion");
		hs.add("Tiger");
		hs.add("Monkey");
		hs.add("Elephant");
		hs.add("Fox");
		hs.add("Wolf");
		
		
		
		int n = hs.size();
		System.out.println("Size of the hash is " +n);
		
		hs.remove("Fox");
		for(String s:hs) {
			System.out.println(s);
		}
		
		if(hs.remove("Snake")) {
			System.out.println("Snake is present removed");
		}
		else {
			System.out.println("Snake is not present in the set");
		}
		
		if(hs.contains("Wolf")) {
			
			System.out.println("Wolf is present in the set");
		}
		else {
			System.out.println("Wolf is not present in the set");
		}
		
		System.out.println("Updated set is:");
		for(String s:hs) {
			System.out.println(s);
		}
	}

}
