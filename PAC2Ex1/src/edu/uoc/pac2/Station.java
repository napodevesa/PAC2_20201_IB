package edu.uoc.pac2;




public class Station {
	private int id;
	private int nextId = 0;
	private String name;
	private String street = "Sesame Street";
	private float latitude = 0;
	private float longitude = 0;
	private int capacity = 24;
	
	
	
	public Station(String string, String string2, double d, int i, int j) {
		// TODO Auto-generated constructor stub
	
	
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
	
	//name
	public String getName(String name) {
		 
		return name;
	}
	
	public void setName(String name) {
		
		if (name.length()> 0 && name.length() <= 50) {
		
		this.name = name;
		}else {
			
			System.out.println("[ERROR] Station's name cannot "
					+ "be longer than 50 characters]");			
		}
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


	

	
}
