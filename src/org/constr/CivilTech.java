package org.constr;

public class CivilTech {
	
	public CivilTech () {
	
		
		this("erode");
		
		System.out.println("default constructor");
	}
public CivilTech (String Address) {
	    
	this(124);
	
		System.out.println("string argument constructor:"+Address);
	}
public CivilTech (int id) {
    
      System.out.println("Integer argument constructor:"+id);
}
}
