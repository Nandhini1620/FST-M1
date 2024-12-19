package fst_m1_java;

public class Activity4 {
//insertion sort


public static void main(String args[])
{
    int arr[] = { 12, 11, 13, 5, 6 };
    int n = arr.length;
    
    System.out.println("Before sorting");
	for(int i=0;i<n;++i)
	{
		System.out.println(arr[i] + " ");
		System.out.println();
	}
    
    
    
    InserSortClassActivity4 is = new InserSortClassActivity4();
    
    is.sort(arr, n);
    is.printArray(arr, n);
    
    
    
 }

 
}
