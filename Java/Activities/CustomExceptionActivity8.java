package fst_m1_java;

public class CustomExceptionActivity8 extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	CustomExceptionActivity8(String message){
	this.message=message;
	}
	public String getMessage() {
	    return message;
	}

}
