package com.ubs.opsit.interviews.berlinclockimpl;

import org.apache.log4j.Logger;

import com.ubs.opsit.interviews.TimeComponentConverter;
import com.ubs.opsit.interviews.constants.BerlinClockConstants;

/**
 * This class converts seconds component of time to Berlin Clock representation.
 * 
 * @author Kaustubh Padhye
 *
 */

public class BerlinClockSecondsConverter implements TimeComponentConverter{
	
	private static final Logger LOG = Logger.getLogger(BerlinClockSecondsConverter.class);

	/**
	 * This method converts seconds into Berlin clock representation of a single row.
	 *  
	 * @param seconds seconds to be converted between 0 to 59
	 */
	@Override
	public String convert(int seconds) {
		LOG.debug("converting seconds - " + seconds);
		String secondsRow = (seconds % 2==0)?BerlinClockConstants.LAMP_ON_YELLOW:BerlinClockConstants.LAMP_OFF;
		LOG.debug("Seconds row - " + secondsRow);
		return secondsRow;
	}

}
