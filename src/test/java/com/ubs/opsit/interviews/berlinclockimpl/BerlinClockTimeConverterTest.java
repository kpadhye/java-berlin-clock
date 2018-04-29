package com.ubs.opsit.interviews.berlinclockimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.TimeConverter;

public class BerlinClockTimeConverterTest {

	private TimeConverter berlinClockTimeConverter;

	@Before
	public void setUp() throws Exception {
		berlinClockTimeConverter = new BerlinClockTimeConverter();
	}

	@Test
	public void testZeroTime() {
		StringBuilder expectedOutput = new StringBuilder()
				.append("Y")
				.append(System.lineSeparator())
				.append("OOOO")
				.append(System.lineSeparator())
				.append("OOOO")
				.append(System.lineSeparator())
				.append("OOOOOOOOOOO")
				.append(System.lineSeparator())
				.append("OOOO");
		assertEquals(expectedOutput.toString(), berlinClockTimeConverter.convertTime("00:00:00"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInvalidInputValidation() {
		berlinClockTimeConverter.convertTime("25:00:00");
	}

}
