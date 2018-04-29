package com.ubs.opsit.interviews.berlinclockimpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.TimeComponentConverter;

public class BerlinClockMinutesConverterTest {
	
	private TimeComponentConverter minutesConverter;

	@Before
	public void setUp() throws Exception {
		minutesConverter=new BerlinClockMinutesConverter();
	}

	@Test
	public void testMinutes0() {
		StringBuilder expectedMinutesRows=new StringBuilder()
				.append("OOOOOOOOOOO")
				.append(System.lineSeparator())
				.append("OOOO");
		assertEquals(expectedMinutesRows.toString(),minutesConverter.convert(0));
	}
	
	@Test
	public void testMinutes4() {
		StringBuilder expectedMinutesRows=new StringBuilder()
				.append("OOOOOOOOOOO")
				.append(System.lineSeparator())
				.append("YYYY");
		assertEquals(expectedMinutesRows.toString(),minutesConverter.convert(4));
	}
	
	@Test
	public void testMinutes15() {
		StringBuilder expectedMinutesRows=new StringBuilder()
				.append("YYROOOOOOOO")
				.append(System.lineSeparator())
				.append("OOOO");
		assertEquals(expectedMinutesRows.toString(),minutesConverter.convert(15));
	}
	
	@Test
	public void testMinutes59() {
		StringBuilder expectedMinutesRows=new StringBuilder()
				.append("YYRYYRYYRYY")
				.append(System.lineSeparator())
				.append("YYYY");
		assertEquals(expectedMinutesRows.toString(),minutesConverter.convert(59));
	}

}
