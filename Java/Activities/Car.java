package fst_m1_java;

public class Car {
	//properties
	String color;
	String type;
	int wheels;
	int speed;
	
	Car(String color, String type, int wheels, int speed){
		this.color=color;
		this.type=type;
		this.wheels=wheels;
		this.speed=speed;
	}
	
	public void increase(int s) {
		System.out.println(s++);
	}
	
	public void printColor(String color)
	{
		System.out.println("Color of the car is" +color);
	}
	

}
