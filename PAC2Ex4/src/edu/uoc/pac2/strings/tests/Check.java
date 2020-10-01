package edu.uoc.pac2.strings.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import edu.uoc.pac2.strings.PAC2Ex4;

@TestInstance(Lifecycle.PER_CLASS)
public class Check {

	PAC2Ex4 p;
	
	@BeforeAll
	void init() {
		p = new PAC2Ex4();
	}
	
	@Test
	void testReverseText() {
		assertEquals(null,p.reverseText(null));
		assertEquals("aloh",p.reverseText("hola"));
		assertEquals("atatap",p.reverseText("patata"));
		assertEquals("divad aloh",p.reverseText("hola david"));
		assertEquals("765 4321",p.reverseText("1234 567"));
	}
	
	@Test
	void testCountM() {
		assertEquals(0,p.countM(null));
		assertEquals(0,p.countM("hola"));
		assertEquals(1,p.countM("Marina"));
		assertEquals(2,p.countM("Mama"));
		assertEquals(1,p.countM("melon"));
		assertEquals(2,p.countM("mermelada"));
		assertEquals(5,p.countM("mmmMm"));
	}
	
	@Test
	void testCapitalize() {
		assertEquals(null,p.capitalize(null,0));
		assertEquals("hola",p.capitalize("hola",0));
		assertEquals("Hola",p.capitalize("hola",1));
		assertEquals("HOla",p.capitalize("hola",2));
		assertEquals("HOlA",p.capitalize("holA",2));
		assertEquals("HOLA",p.capitalize("hoLA",2));
		assertEquals("HOLa",p.capitalize("hola",3));
		assertEquals("HOLA",p.capitalize("hOLA",3));
		assertEquals("HOLA",p.capitalize("holA",3));
		assertEquals("HOLA",p.capitalize("hola",4));
		assertEquals("HOLA",p.capitalize("HOLA",4));
		assertEquals("HOLA",p.capitalize("hoLA",4));
		assertEquals("HOLA",p.capitalize("hola",5));
		assertEquals("HOLA",p.capitalize("hola",10));
		assertEquals("hola",p.capitalize("hola",-1));
	}
}
