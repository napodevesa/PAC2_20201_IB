package edu.uoc.pac2;


public class Station {
	private int id;
	private static int nextId = 0;
	private String name = "Default";
	private String street = "Sesame Street";
	private double latitude = 0;
	private double longitude = 0;
	private int capacity = 24;
	
	

	public Station( String name, String street, double latitude, double longitude, int capacity) {
		// TODO Auto-generated constructor stub
		
		setId(nextId++);
		setName(name);
		setStreet(street);
		setLatitude(latitude);
		setLongitude(longitude);
		setCapacity(capacity);
		
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



	public Station() {
		// TODO Auto-generated constructor stub
		setId(nextId++);
		setName(name);
		setStreet(street);
		setLatitude(latitude);
		setLongitude(longitude);
		setCapacity(capacity);
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
	
	
	public void setLatitude(double latitude) {
		
		if (latitude <= 90 && latitude >= -90 ) { 
	
			this.latitude = (float) latitude;
		} else {
				System.out.println("[ERROR] Station's latitude "
						+ "must be in range [-90,+90]");
		}
			
	}
	
	//longitude
	
	public float getLongitude() {
		return (float) longitude;
	}
	
	public void setLongitude(double longitude) {
		if (longitude <= 180 && longitude >= -180 ) { 
			this.longitude = (float) longitude;
		}else {
			System.out.println("[ERROR] Station's longitude must "
					+ "be in range [-180,+180]");
		}
	}
	
	//capacity
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		if (capacity > 0 ) { 
			this.capacity = capacity;
		}else {
			System.out.println("[ERROR] Station's capacity must "
					+ "be greater than 0");
		}
	}
	
	
	//name 
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		if ( name.length() > 50) {
			System.out.println("[ERROR] Station's name cannot "
					+ "be longer than 50 characters");	
				
		}else {
			
			this.name = name;
		}


	}

	//nextId
	
	public static int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		
		Station.nextId = nextId ;
	}

	
}
