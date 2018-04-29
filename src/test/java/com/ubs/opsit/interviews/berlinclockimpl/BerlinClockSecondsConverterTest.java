package com.ubs.opsit.interviews.berlinclockimpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.TimeComponentConverter;

public class BerlinClockSecondsConverterTest {
	
	private TimeComponentConverter secondsConverter;

	@Before
	public void setUp() throws Exception {
		secondsConverter=new BerlinClockSecondsConverter();
	}

	@Test
	public void testEvenSeconds() {
		assertEquals("Y",secondsConverter.convert(0));
		assertEquals("Y",secondsConverter.convert(4));
		assertEquals("Y",secondsConverter.convert(20));
	}

	@Test
	public void testOddSeconds() {
		assertEquals("O",secondsConverter.convert(1));
		assertEquals("O",secondsConverter.convert(7));
		assertEquals("O",secondsConverter.convert(35));
	}
}
