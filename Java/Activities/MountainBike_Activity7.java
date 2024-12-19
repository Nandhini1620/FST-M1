package fst_m1_java;

public class MountainBike_Activity7 extends Bicycle_Activity7{
	
	int seatheight;

	
	public MountainBike_Activity7(int gear, int speed, int seatheight) {
		super(gear, speed);
		seatheight=0;
	}
	public void setHeight(int newValue) {
		seatheight = newValue;
	}
	
	public String bicycleDesc() {
		return(super.bicycleDesc() +seatheight);
		
	}

	

}
