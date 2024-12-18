package fst_m1_java;

public class HelloWorld {

	public static void main(String[] args) {
		String name="Nandhini";
		int num=1;
		System.out.println("I am "+name+" and this is my "+num+" st program on Full stack Tester program");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
		int a=10;
		int b=8;
		if (a<b)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B is greater");
		}
		
		Car car1= new Car("Red", "Automatic",4,0);
		Car car2= new Car("Blue", "Manual", 4,0);
		
		car1.increase(5);
		car1.printColor("Blue");
	}

}
