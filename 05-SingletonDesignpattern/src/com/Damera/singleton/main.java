package com.Damera.singleton;

public class main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	
	}

}
