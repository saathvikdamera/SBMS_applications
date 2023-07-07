package com.Damera.singleton;

public class Singleton {
	
	//eager initialization
	//static Singleton s = new Singleton();
	
	//lazy initialization
	static Singleton s = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s == null)
			s = new Singleton();
		return s;
	}

}
