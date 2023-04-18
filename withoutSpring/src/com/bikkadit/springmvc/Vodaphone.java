package com.bikkadit.springmvc;

public class Vodaphone implements Sim{

	@Override
	public void calling() {
		System.out.println("calling using vodaphone mobile.");
		
	}

	@Override
	public void browse() {
	System.out.println("browsing internat using airtel sim");
		
	}

}
