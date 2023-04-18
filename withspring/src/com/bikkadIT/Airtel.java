package com.bikkadIT;

public class Airtel implements  Sim{

	
	public Airtel() {
		System.out.println("Airtel class constructor");
	}
	@Override
	public void calling() {
		System.out.println("Calling via Airtel");
		
	}

	@Override
	public void browse() {
		System.out.println("browsing via Airtel");
		
	}
	
	
	

}
