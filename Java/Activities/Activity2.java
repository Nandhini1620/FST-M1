package fst_m1_java;

public class Activity2 {

	public static void main(String[] args) {
		int[] arr = { 10,77,-11,10,54,10,10 };
		int len = arr.length;
		int i,sum=0;
		int num=10;
		
		for (int n : arr) {
            
            if (n == num) {
                
                sum = sum + num;
            }
            
    		
    		if (sum == 30)
    		{
    			break;
    		}
    			

	}
		System.out.println("Array has 4 10's, so the condition matches, it stopped at 30 so total is "+sum);
		

}
}
