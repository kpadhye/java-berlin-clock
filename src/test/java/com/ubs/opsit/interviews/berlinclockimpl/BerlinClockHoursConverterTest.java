package com.ubs.opsit.interviews.berlinclockimpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.TimeComponentConverter;

public class BerlinClockHoursConverterTest {

	private TimeComponentConverter hoursConverter;

	@Before
	public void setUp() throws Exception {
		hoursConverter=new BerlinClockHoursConverter();
	}

	@Test
	public void testHours0() {
		StringBuilder expectedHoursRows = new StringBuilder()
				.append("OOOO")
				.append(System.lineSeparator())
				.append("OOOO");
		assertEquals(expectedHoursRows.toString(), hoursConverter.convert(0));
	}
	
	@Test
	public void testHours24() {
		StringBuilder expectedHoursRows = new StringBuilder()
				.append("RRRR")
				.append(System.lineSeparator())
				.append("RRRR");
		assertEquals(expectedHoursRows.toString(), hoursConverter.convert(24));
	}
	
	@Test
	public void testHours5() {
		StringBuilder expectedHoursRows = new StringBuilder()
				.append("ROOO")
				.append(System.lineSeparator())
				.append("OOOO");
		assertEquals(expectedHoursRows.toString(), hoursConverter.convert(5));
	}
	
	@Test
	public void testHours13() {
		StringBuilder expectedHoursRows = new StringBuilder()
				.append("RROO")
				.append(System.lineSeparator())
				.append("RRRO");
		assertEquals(expectedHoursRows.toString(), hoursConverter.convert(13));
		
	}

}
