package paket1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Flight> flights = new ArrayList<Flight>();
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int option;
		
		
		for(;;)
		{
		System.out.println("Select the number: ");
		System.out.println("1.Create airport ");
		System.out.println("2.Create airline");
		System.out.println("3.Create a flight");
		System.out.println("4.Book a seat on a flight");
		System.out.println("5.Exit");
		System.out.println("");
		option=input.nextInt();
			if(option==1)
			 {	
				String name;
			 	boolean a;
				System.out.println("Name: ");
				name=input.next();
				a=validationNameOfAirport(name);
				
				if(a==true)
				{
					Airport airport = new Airport (name);
					Airport.ListOfAirports.add(airport);
				}	
				
			 }
			else if (option==2)
			{
				String name;
			 	boolean a;
				System.out.println("Name: ");
				name=input.next();
				a=validationOfAirlineNames(name);
				
				if(a==true)
				{
					Airline airline = new Airline (name);
					Airline.ListOfAirlines.add(airline);
				}	
			}
			else if(option==3)
			{
				int numberOfRows;
				int numberOfSeatsInARow;
				
				String originAirport, destinationAirport, airline;
				System.out.println("Number of rows: ");
				numberOfRows=input.nextInt();
				System.out.println("Number of seats in a row: ");
				numberOfSeatsInARow=input.nextInt();
				System.out.println("Airport:  ");
				System.out.println("From: ");
				originAirport=input.next();
				System.out.println("To: ");
				destinationAirport=input.next();
				System.out.println("Airline: ");
				airline=input.next();
				
				Flight flight = new Flight(numberOfRows,numberOfSeatsInARow);
				flight.airportAndAirline(originAirport, destinationAirport, airline);
				flight.availableSeats();
				flights.add(flight);
				
			}
			else if(option==4)
			{String originAirport, destinationAirport, airline;
			
				System.out.println("Airport:  ");
				System.out.println("From: ");
				originAirport=input.next();
				
				System.out.println("To: ");
				destinationAirport=input.next();
				
				System.out.println("Airline: ");
				airline=input.next();
				
				
				
				
				for	(int i=0; i<flights.size(); i++)
				{
					if((flights.get(i).destinationAirport.equals(destinationAirport))&&(flights.get(i).originAirport.equals(originAirport))&&(flights.get(i).airline.equals(airline)))
					{char rowsFromNumbers=(char)(flights.get(i).getNumberOfRows()+64);
						
					
						System.out.println("Rows : A - "+ rowsFromNumbers);
						System.out.println("Seats in a row: "+flights.get(i).getNumberOfSeatsInARow());
						
						String row;
						int numberOfSeatInARow;
						int numberOfRow;
						
						
						System.out.println("Row: ");
						row=input.next();
						int num=row.charAt(0);
						if((num<65)||(num>90))
						{
							System.out.println("Rows : A - "+ rowsFromNumbers);
						}	
						
						numberOfRow=row.charAt(0)-65;
						
						System.out.println("Number of seat in a row: ");
						numberOfSeatInARow=input.nextInt();
						
						
						if(flights.get(i).seats[numberOfRow][numberOfSeatInARow-1]==true)
						{flights.get(i).seats[numberOfRow][numberOfSeatInARow-1]=false;}
						else {System.out.println("Seat is taken.");}
					}
				}
				
			}
			else if(option==5)
			{break;}
			else{System.out.println("Wrong input. Not existing option.");}
		}
		
		
	 	

	}

	
	public static boolean validationNameOfAirport(String name)
	{ boolean a=true;
		if(name.length()!=3)
		{
			a=false;
		}
		
		for(int i=0; i<name.length(); i++)
		{
			if(Character.isLetter(name.charAt(i))==false)
			{
				a=false;
				break;
			}	
		}
		if(a==false) 
		{System.out.println("An airport name must consist of exactly three alphabetical characters.");}
		
		for(int k=0; k<Airport.ListOfAirports.size(); k++)
		{
			if(name.equals(Airport.ListOfAirports.get(k).name))
			{
				System.out.println("Airport already exists.");
				a=false;
				break;
			}	
		}	
		return a;
	}
	
	public static boolean validationOfAirlineNames(String name)
	{boolean a=true;
	if(name.length()>6)
	{
		a=false;
	}
	
	for(int i=0; i<name.length(); i++)
	{
		if(Character.isLetter(name.charAt(i))==false)
		{
			a=false;
			break;
		}	
	}
	if(a==false) 
	{System.out.println("An airline must have a name that with less than 6 alphabetic characters.");}
	
	for(int k=0; k<Airline.ListOfAirlines.size(); k++)
	{
		if(!name.equals(Airline.ListOfAirlines.get(k).name))
		{
			System.out.println("Airline already exists.");
			a=false;
		}	
	}	
	return a;}
	
	
	
	
}
