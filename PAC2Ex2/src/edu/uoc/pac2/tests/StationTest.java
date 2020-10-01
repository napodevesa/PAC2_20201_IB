package edu.uoc.pac2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import edu.uoc.pac2.Station;

@TestInstance(Lifecycle.PER_CLASS)
class StationTest {
	
	
	Station s;
		
	
	@BeforeEach
	void init() {
		 try{
			 s = new Station("Poblenou 1", "Rambla Poblenou, 156", 34.5, 89, 10);
		 }catch(Exception e) {
				fail("Parameterized constructor failed");
		}
	}
	
	@Test
	void testStation() {
		try{
			Station station = new Station();
			assertEquals(14,station.getId());
			assertEquals("Default",station.getName());
			assertEquals("Sesame Street",station.getStreet());
			assertEquals(0,station.getLatitude());
			assertEquals(0,station.getLongitude());
			assertEquals(24,station.getCapacity());
		}catch(Exception e) {
			fail("Default constructor failed");
		}
		
	}

	@Test
	void testStationStringStringDoubleDoubleInt() {		
		Exception ex = assertThrows(Exception.class, () ->new Station("Poblenou 1 asfdmñlak ñlasdkf ñlsak dskfñlkasdñl fa dfasf adsf", "Rambla Poblenou, 156", 34.5, 82, 10)); 
		assertEquals("[ERROR] Station's name cannot be longer than 50 characters", ex.getMessage());
		
		ex = assertThrows(Exception.class, () ->new Station("Poblenou 1", "Rambla Poblenou, 156", -94.5, 82, 10));
		assertEquals("[ERROR] Station's latitude must be in range [-90,+90]", ex.getMessage());
		
		ex = assertThrows(Exception.class, () ->new Station("Poblenou 1", "Rambla Poblenou, 156", 34.5, 182, 10));
		assertEquals("[ERROR] Station's longitude must be in range [-180,+180]", ex.getMessage());
		
		ex = assertThrows(Exception.class, () ->new Station("Poblenou 1", "Rambla Poblenou, 156", 34.5, 82, -30));
		assertEquals("[ERROR] Station's capacity must be greater than 0", ex.getMessage());		
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
		try{
			s.setName("Horta 2");
			assertEquals("Horta 2",s.getName());
		}catch(Exception e) {
			fail("setName failed");
		}
		
		
		Exception ex = assertThrows(Exception.class, () ->	s.setName("ksañlfkañk f kñalskf ñakñfdk sdfkañlkfd añlskfdñ lasdkfñlkaslf "));
		assertEquals("[ERROR] Station's name cannot be longer than 50 characters", ex.getMessage());
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
		try{
			s.setLatitude(50);
			assertEquals(50,s.getLatitude());
		}catch(Exception e) {
			fail("setLatitude failed");
		}
		
		Exception ex = assertThrows(Exception.class, () ->	s.setLatitude(91));
		assertEquals("[ERROR] Station's latitude must be in range [-90,+90]", ex.getMessage());
		
		
		ex = assertThrows(Exception.class, () ->	s.setLatitude(-91));
		assertEquals("[ERROR] Station's latitude must be in range [-90,+90]", ex.getMessage());
	}

	@Test
	void testGetLongitude() {
		assertEquals(89,s.getLongitude());		
	}

	@Test
	void testSetLongitude() {
		try{
			s.setLongitude(150);
			assertEquals(150,s.getLongitude());
		}catch(Exception e) {
			fail("setLongitude failed");
		}
		
		Exception ex = assertThrows(Exception.class, () ->	s.setLongitude(181));
		assertEquals("[ERROR] Station's longitude must be in range [-180,+180]", ex.getMessage());
	
		ex = assertThrows(Exception.class, () ->	s.setLongitude(-180.5));
		assertEquals("[ERROR] Station's longitude must be in range [-180,+180]", ex.getMessage());		
	}

	@Test
	void testGetCapacity() {
		assertEquals(10,s.getCapacity());
	}

	@Test
	void testSetCapacity() {
		try{
			s.setCapacity(15);
			assertEquals(15,s.getCapacity());
		}catch(Exception e) {
			fail("setCapacity failed");
		}
		
		Exception ex = assertThrows(Exception.class, () ->	s.setCapacity(0));
		assertEquals("[ERROR] Station's capacity must be greater than 0", ex.getMessage());
			
		
		ex = assertThrows(Exception.class, () ->	s.setCapacity(-10));
		assertEquals("[ERROR] Station's capacity must be greater than 0", ex.getMessage());		
	}
}