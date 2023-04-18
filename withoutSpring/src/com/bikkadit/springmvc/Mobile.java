package com.bikkadit.springmvc;

public class Mobile {

	public static void main(String[] args) {
		
		Airtel airtel=new Airtel();
		airtel.calling();
		airtel.browse();
		
		
		Vodaphone vodaphone=new Vodaphone();
		vodaphone.calling();
		vodaphone.browse();
		
		
		Sim sim=new Airtel();
		sim.calling();
		sim.browse();
		
		Sim sim1=new Vodaphone();
		sim.calling();
		sim.browse();

	}

}
