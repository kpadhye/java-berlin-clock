package com.ubs.opsit.interviews.berlinclockimpl;

import org.junit.Before;
import org.junit.Test;

import com.ubs.opsit.interviews.TimeValidator;

public class BerlinClockInputTimeValidatorTest {

	private TimeValidator timeValidator;
	
	@Before
	public void setUp() throws Exception {
		timeValidator=new BerlinClockInputTimeValidator();
	}

	@Test(expected=IllegalArgumentException.class)
	public void testForInputTimeNull() {
		timeValidator.validate(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testForInputTimeBlank() {
		timeValidator.validate("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInputTimeWithAlphabets() {
		timeValidator.validate("AA:05:00");
	}
	
	@Test
	public void testInputTimeWithMidnight() {
		timeValidator.validate("00:00:00");
	}
	
	@Test
	public void testInputTimeWithMidnightOther() {
		timeValidator.validate("24:00:00");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInputTimeWithOutOfRangeHours() {
		timeValidator.validate("25:00:00");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInputTimeWithOutOfRangeMinutes() {
		timeValidator.validate("01:60:00");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testInputTimeWithOutOfRangeSeconds() {
		timeValidator.validate("01:30:60");
	}
	
	@Test
	public void testInputTimeWithValidUpperBounds() {
		timeValidator.validate("23:59:59");
	}

}
