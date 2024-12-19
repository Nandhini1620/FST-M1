package fst_m1_java;

public class Bicycle_Activity7 implements BicycleParts, BicycleOperations{
	//why we are declaring here again
	public int gear;
	public int speed;
	
	public Bicycle_Activity7(int gear, int speed) {
		
		this.gear=gear;
		this.speed=speed;
	}

	@Override
	public void applyBrake(int decrement) {
		speed -= decrement;
		System.out.println("Current speed: " + speed);
		
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
		System.out.println("Current speed: " + speed);
		
	}
	
	public String bicycleDesc() {
		return("No of gears are "+ gear + "\nSpeed of bicycle is " + speed);
		
	}
	

}
