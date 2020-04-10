package paket1;

public class Flight extends Airline{

	private int numberOfRows;
	private int numberOfSeatsInARow;
	String originAirport, destinationAirport, airline;
	boolean [][] seats;
	
	Flight()
	{}
	
	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public int getNumberOfSeatsInARow() {
		return numberOfSeatsInARow;
	}

	public void setNumberOfSeatsInARow(int numberOfSeatsInARow) {
		this.numberOfSeatsInARow = numberOfSeatsInARow;
	}

	Flight(int numberOfRows, int  numberOfSeatsInARow)
	{
		this.numberOfRows=numberOfRows;
		this.numberOfSeatsInARow=numberOfSeatsInARow;
		
	}
	
	
	public void availableSeats()
	{	seats= new boolean [this.numberOfRows][this.numberOfSeatsInARow];
		for(int i=0; i< this.numberOfRows; i++)
		{for(int k=0; k<this.numberOfSeatsInARow; k++)
			{
			seats[i][k]=true;
			}
		}
				
	}
	
	public void airportAndAirline(String originAirport, String destinationAirport, String airline)

	{ 	boolean airportOriginExists=false;
		boolean airportDestinationExists=false;	
		boolean airlineExists=false;
		for(int i=0; i<Airport.ListOfAirports.size(); i++)
		{
			if(originAirport.equals(Airport.ListOfAirports.get(i).name))
			{
				this.originAirport=Airport.ListOfAirports.get(i).name;
				airportOriginExists=true;
			}
			
			if(destinationAirport.equals(Airport.ListOfAirports.get(i).name))
			{
				this.destinationAirport=Airport.ListOfAirports.get(i).name;
				airportDestinationExists=true;
			}
		}
		
		if(airportOriginExists=false)
		{
			System.out.println("Not existing airport: Origin.");
		}
		if(airportDestinationExists=false)
		{
			System.out.println("Not existing airport: Destination.");
		}
		
		for(int i=0; i<Airline.ListOfAirlines.size(); i++)
		{
				if(airline.equals(Airline.ListOfAirlines.get(i).name))
				{
					this.airline=Airline.ListOfAirlines.get(i).name;
					airlineExists=true;
				}
		}
		if(airlineExists=false)
		{
			System.out.println("Not existing airline.");
		}	
	}
}
