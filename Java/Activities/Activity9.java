package fst_m1_java;

import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args) {
	
	ArrayList<String> mylist = new ArrayList<String>();
	mylist.add("Arun");
	mylist.add("Adheethan");
	mylist.add("Akaran");
	mylist.add("Akiran");
	mylist.add("Ahaan");
	
	//print array
	for(String s:mylist) {
		System.out.println(s);
			}
	
	//get method
	String item=mylist.get(3);
	System.out.println("3rd item is " +item);
	
	//contains
	boolean item2=mylist.contains("Akiran");
	System.out.println("Yes, this items is present " +item2);
	
	
	//size method
	
	int n = mylist.size();
	System.out.println("Size of the list is " +n);
	
	//remove
	mylist.remove(0);
	int n1 = mylist.size();
	System.out.println("Size of the list is " +n1);
	

}}
