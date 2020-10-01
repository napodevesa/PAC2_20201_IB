package edu.uoc.pac2;




public class Station {
	private int id;
	private int nextId = 0;
	private String name = "Default";
	private String street = "Sesame Street";
	private float latitude = 0;
	private float longitude = 0;
	private int capacity = 24;
	
	
	
	public Station( String name, String street, double latitude, int longitude, int capacity) {
		// TODO Auto-generated constructor stub
		
		
		this.name = name;
		this.street = street;
		this.latitude = (float) latitude;
		this.longitude = longitude;
		this.capacity = capacity;
	
	
	}


	public Station() {
		// TODO Auto-generated constructor stub
	}


	//id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = getNextId(id) ;
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
		
		return latitude;
	}
	
	
	public void setLatitude(double latitude) {
		
		if (latitude <= 90 && latitude >= -90 ) { 
	
			this.latitude = (float) latitude;
		} else {
				System.out.println("[ERROR] Station's latitude "
						+ "must be in range [-90,+90]");
		}
			
	}
	
	
	public float getLongitude() {
		return longitude;
	}
	
	public void setLongitude(double longitude) {
		if (longitude <= 180 && longitude >= -180 ) { 
			this.longitude = (float) longitude;
		}else {
			System.out.println("[ERROR] Station's longitude must "
					+ "be in range [-180,+180]");
		}
	}
	
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

	public int getNextId(int id2) {
		id2++;
		return id2;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}





	public static Integer getNextId() {
		// TODO Auto-generated method stub
		return null;
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
	

	
}
