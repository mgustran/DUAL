package conversores;

import static org.junit.Assert.*;
import org.junit.Test;

public class DistanceConverterCasosTest {
	private double feets = 0;
	private double meters = 0;
	private double cm = 0;
	private double inches = 0;


	@Test
	public void testConvertFeettoMeters() {
		feets = 1;
		meters = DistanceConverter.convertFeettoMeters(feets);
		assertEquals(meters, 0.3048,0.001);
	}
	
	@Test
	public void testConvertMeterstoFeet() {
		meters = 1;
		feets = DistanceConverter.convertMeterstoFeet(meters);
		assertEquals(3.281,feets,0.001);
	}
	
	@Test
	public void testConvertFeettoInches() {
		feets = 1;
		inches = DistanceConverter.convertFeettoInches(feets);
		assertEquals(12,inches,0.001);
	}

	@Test
	public void testConvertInchestoFeet() {
		inches = 12;
		feets = DistanceConverter.convertInchestoFeet(inches);
		assertEquals(1,feets,0.001);
	}
	
	@Test
	public void testConvertCmtoFeet() {
		cm = 10;
		feets = DistanceConverter.convertCmtoFeet(cm);
		assertEquals(0.3281,feets,0.001);
	}

	@Test
	public void testConvertFeettoCm() {
		feets = 1;
		cm = DistanceConverter.convertFeettoCm(feets);
		assertEquals(30.48,cm,0.001);
	}
	
	@Test
	public void testConvertCmtoInches() {
		cm = 10;
		inches = DistanceConverter.convertCmtoInches(cm);
		assertEquals(3.9371,inches,0.001);
	}
	
	@Test
	public void testConvertInchestoCm() {
		inches = 10;
		cm = DistanceConverter.convertInchestoCm(inches);
		assertEquals(25.4,cm,0.001);
	}
}