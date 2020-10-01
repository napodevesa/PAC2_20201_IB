package edu.uoc.pac2.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import edu.uoc.pac2.Station;

@TestInstance(Lifecycle.PER_CLASS)
class StationTest {
	
	private ByteArrayOutputStream outContent;	
	private final PrintStream originalOut = System.out;	
	

	Station s;
	
	@BeforeEach
	public void setUpStreams() {
		outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));	    
	}
	
	@AfterEach
	public void restoreStreams() {
	    System.setOut(originalOut);
	}
	
	@BeforeEach
	void init() {
		 s = new Station("Poblenou 1", "Rambla Poblenou, 156", 34.5, 89, 10);
	}
	
	@Test
	void testStation() {
		Station station = new Station();
		assertEquals(14,station.getId());
		assertEquals("Default",station.getName());
		assertEquals("Sesame Street",station.getStreet());
		assertEquals(0,station.getLatitude());
		assertEquals(0,station.getLongitude());
		assertEquals(24,station.getCapacity());
	}

	@Test
	void testStationStringStringDoubleDoubleInt() {		
		
	}

	@Test
	void testGetId() {
		assertEquals(1,s.getId());		
	}

	@Test
	void testGetNextId() {
		assertEquals(10,Station.getNextId());
	}

	@Test
	void testGetName() {
		assertEquals("Poblenou 1",s.getName());		
	}

	@Test
	void testSetName() {
		s.setName("Horta 2");
		assertEquals("Horta 2",s.getName());
		
		s.setName("ksañlfkañk f kñalskf ñakñfdk sdfkañlkfd añlskfdñ lasdkfñlkaslf ");
		assertEquals("[ERROR] Station's name cannot be longer than 50 characters", outContent.toString().replaceAll("\n|\r\n", System.getProperty("line.separator").trim()));
	}

	@Test
	void testGetStreet() {
		assertEquals("Rambla Poblenou, 156",s.getStreet());	
	}

	@Test
	void testSetStreet() {
		s.setStreet("Plaça Eivissa");
		assertEquals("Plaça Eivissa",s.getStreet());
	}

	@Test
	void testGetLatitude() {		
		assertEquals(34.5,s.getLatitude());		
	}

	@Test
	void testSetLatitude() {
		s.setLatitude(50);
		assertEquals(50,s.getLatitude());
		
		s.setLatitude(91);
		assertEquals("[ERROR] Station's latitude must be in range [-90,+90]", outContent.toString().replaceAll("\n|\r\n", System.getProperty("line.separator").trim()));
		
		restoreStreams();
		
		s.setLatitude(-91);
		assertEquals("[ERROR] Station's latitude must be in range [-90,+90]", outContent.toString().replaceAll("\n|\r\n", System.getProperty("line.separator").trim()));
		
		s.setLatitude(90);
		assertEquals(90,s.getLatitude());

		s.setLatitude(-90);
		assertEquals(-90,s.getLatitude());		
	}

	@Test
	void testGetLongitude() {
		assertEquals(89,s.getLongitude());		
	}

	@Test
	void testSetLongitude() {
		s.setLongitude(150);
		assertEquals(150,s.getLongitude());
		
		s.setLongitude(181);
		assertEquals("[ERROR] Station's longitude must be in range [-180,+180]", outContent.toString().replaceAll("\n|\r\n", System.getProperty("line.separator").trim()));
		
		restoreStreams();
		
		s.setLongitude(-180.5);
		assertEquals("[ERROR] Station's longitude must be in range [-180,+180]", outContent.toString().replaceAll("\n|\r\n", System.getProperty("line.separator").trim()));
		
		s.setLongitude(180);
		assertEquals(180,s.getLongitude());

		s.setLongitude(-180);
		assertEquals(-180,s.getLongitude());		
	}

	@Test
	void testGetCapacity() {
		assertEquals(10,s.getCapacity());
	}

	@Test
	void testSetCapacity() {
		s.setCapacity(15);
		assertEquals(15,s.getCapacity());
		
		s.setCapacity(0);
		assertEquals("[ERROR] Station's capacity must be greater than 0", outContent.toString().replaceAll("\n|\r\n", System.getProperty("line.separator").trim()));
		
		restoreStreams();
		
		s.setCapacity(-10);
		assertEquals("[ERROR] Station's capacity must be greater than 0", outContent.toString().replaceAll("\n|\r\n", System.getProperty("line.separator").trim()));
		
	}
}