package fst_m1_java;




public class Activity6 {	
	

	public static void main(String[] args) throws InterruptedException  {
		Plane_Activity6 plane = new Plane_Activity6(10);
		plane.onboard("kiran");
		plane.onboard("Akiran");
		plane.onboard("Akaran");

		System.out.println("Plane took off at: " + plane.takeoff());
        
        System.out.println("People on the plane: " + plane.getPassesngers());
        
        Thread.sleep(5);
        
        plane.land();
       
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassesngers());
		
	}

}
