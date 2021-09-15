package com.lti.client;

import com.lti.model.Flight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight flight = new Flight(1001, "A", "B");
		System.out.println(flight.getFlightId()+" "+flight.getSource()+" "+flight.getDestination());
	}

	public static int add(int n1, int n2) {return n1+n2;}
	public static boolean compare(int n1,int n2)
	{
		if(n1==n2){return true;}
		else return false;
	}
}
