package paket1;

import java.util.ArrayList;

public class Airline extends Airport {

	protected String name;
	static ArrayList<Airline> ListOfAirlines= new ArrayList<Airline>();
	Airline()
	 {}
	
	Airline(String name)
	 {
		this.name=name;
	 }
	
	public void addAirline(Airline airline)
	{
		ListOfAirlines.add(airline);
	}
}
