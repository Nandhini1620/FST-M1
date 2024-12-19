package fst_m1_java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane_Activity6 {
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    Plane_Activity6(int maxPassengers){
    	this.maxPassengers= maxPassengers;
    	this.passengers = new ArrayList<>();
    	
    }
    
    public void onboard(String passengers) {
    	this.passengers.add(passengers);
    }
     public Date takeoff() {
    	 this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
    	 
     }
     public void land() {
    	 this.lastTimeLanded = new Date();
    	 this.passengers.clear();
    	 
     }
     
     public Date getLastTimeLanded() {
    	 return lastTimeLanded;
     }
     public List getPassesngers() {
    	 return passengers;
     }

}
