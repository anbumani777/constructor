package org.constr;

public class ComputerTec extends CivilTech {
	public  ComputerTec() {
		
		this("manikandan");
		
		System.out.println("default constructor");
	}
	public  ComputerTec(String name) {
		
	this(123);
	
	 System.out.println("String argument constructor:"+name);
	}
	public  ComputerTec(int id) {
		
		super(124);
	
		System.out.println("integer argument constructor:"+id);
	}
	
	public static void main(String[] args) {
		 ComputerTec n = new ComputerTec();
	}
}
