package com.ubs.opsit.interviews.berlinclockimpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.ubs.opsit.interviews.TimeValidator;
import com.ubs.opsit.interviews.constants.BerlinClockConstants;

/**
 * This class validates the time that is to be converted to berlin clock representation.
 * 
 * @author Kaustubh Padhye
 *
 */
public class BerlinClockInputTimeValidator implements TimeValidator {
	
	private static final Logger LOG=Logger.getLogger(BerlinClockInputTimeValidator.class);
	
	/**
	 * This method validates that the time is non blank and is in proper format between 00:00:00 and 24:00:00.
	 * 
	 */
	@Override
	public void validate(String time) {
		LOG.debug("Validating time - " + time);
		validateForNullOrBlankTime(time);
		LOG.debug("Time is neither null nor empty string.");
		validateForProperTimeFormat(time);
		LOG.debug("Time is in proper format.");
	}
	
	private void validateForNullOrBlankTime(String time) {
		if (StringUtils.isBlank(time)) {
			LOG.error("Time cannot be null or empty.");
			throw new IllegalArgumentException("Time cannot be null or empty.");
		}
	}

	private void validateForProperTimeFormat(String time) {
		Pattern pattern=Pattern.compile(BerlinClockConstants.VALID_TIME_FORMAT);
		Matcher matcher=pattern.matcher(time);
		if (!matcher.matches()) {
			LOG.error("Time is not in proper format.");
			throw new IllegalArgumentException("Time to be converted should be in proper format between 00:00:00 and 24:00:00.");
		}
	}


}
