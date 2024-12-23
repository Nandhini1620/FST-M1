package fst_m1_java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		Random indexgen = new Random();		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter integers please ");
		System.out.println("(EOF or non-integer to terminate): ");
		 
		
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		//System.out.println("Next int value: " + .nextInt(5));
		int index = indexgen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);
 
        scan.close();
	}

}
