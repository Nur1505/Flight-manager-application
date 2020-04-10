package paket1;

import java.util.ArrayList;

public class Airport {

	protected String name;
	static ArrayList<Airport> ListOfAirports= new ArrayList<Airport>();
	
	Airport()
	 {}
	
	Airport(String name)
	 {
		this.name=name;
	 }
	
	public void addAirport(Airport airport)
	{
		ListOfAirports.add(airport);
	}
}
