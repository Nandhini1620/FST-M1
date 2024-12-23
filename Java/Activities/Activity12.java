package fst_m1_java;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddableActivity12 a1 = (num1, num2) -> (num1+num2);
		System.out.println(a1.add(10,20));
		
		AddableActivity12 a2 = (int num1, int num2) ->{
		return (num1+num2);
		};
        System.out.println(a2.add(5, 10));
	}

}
