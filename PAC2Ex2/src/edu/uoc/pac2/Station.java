
package edu.uoc.pac2;



public class Station {
	private int id;
	private static int nextId = 0;
	private String name = "Default";
	private String street = "Sesame Street";
	private double latitude = 0;
	private double longitude = 0;
	private int capacity = 24;
	
	

	public Station( String name, String street, double latitude, double longitude, int capacity) throws Exception {
		// TODO Auto-generated constructor stub
		
		//setId(nextId++);
		setName(name);
		setStreet(street);
		setLatitude(latitude);
		setLongitude(longitude);
		setCapacity(capacity);
		
		setNextId(nextId);
		
		
		try  
	      {  
			setId(nextId++);
	      }  
	      catch(Exception e)  
	      {  
	    	  setId(id);;
	      }  
		
		/*
		this.id= id;
		this.name = name;
		this.street = street;
		this.latitude =  latitude;
		this.longitude = longitude;
		this.capacity = capacity;
		setId(nextId++);
		//nextId++;
	
	*/
		
		
		
	}



	public Station() throws Exception {
		// TODO Auto-generated constructor stub
		
		setId(nextId++);
		setName(name);
		setStreet(street);
		setLatitude(latitude);
		setLongitude(longitude);
		setCapacity(capacity);
		
		setNextId(nextId);
		
		
	}


	//id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		//this.id = nextId++ ;
		this.id = id ;
		
		
		
	}
	
	
	
	//street
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	//latitude
	
	public float getLatitude() {
		
		return (float) latitude;
	}
	
	
	public void setLatitude(double latitude) throws Exception {
		
		if (latitude > 90 || latitude < -90 ) { 
			throw new Exception ("[ERROR] Station's latitude "
					+ "must be in range [-90,+90]");
	
		}
		
		this.latitude = (float) latitude;
			
	}
	
	//longitude
	
	public float getLongitude() {
		return (float) longitude;
	}
	
	public void setLongitude(double longitude) throws Exception {
		if (longitude > 180 || longitude < -180 ) { 
			
			throw new Exception ("[ERROR] Station's longitude must "
					+ "be in range [-180,+180]");
			
			
		}
		this.longitude = (float) longitude;
	}
	
	//capacity
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) throws Exception {
		if (capacity <= 0 ) { 
			throw new Exception ("[ERROR] Station's capacity must "
					+ "be greater than 0");
		}
		this.capacity = capacity;
	}
	
	
	//name 
	
	public String getName() {
		return name;
	}


	public void setName(String name) throws Exception{
		
		if ( name.length() > 50) {
			throw new Exception ("[ERROR] Station's name cannot "
					+ "be longer than 50 characters");	
				
		}
			
			this.name = name;
		}


	//nextId
	
	public static int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		
		Station.nextId = nextId ;
	}

	
}
