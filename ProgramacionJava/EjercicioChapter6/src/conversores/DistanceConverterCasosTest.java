package conversores;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceConverterCasosTest {
	private double feets = 0;
	private double meters = 0;
	private double inches = 0;
	private double cm = 0;

	@Test
	public void testConvertFeettoMeters() {
		feets = 1;
		meters = DistanceConverter.convertFeettoMeters(feets);
		assertEquals(meters, 0.3048,0.001);
	}

	@Test
	public void testConvertMeterstoFeet() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertFeettoInches() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertInchestoFeet() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertCmtoFeet() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertFeettoCm() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertCmtoInches() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertInchestoCm() {
		fail("Not yet implemented");
	}

}
