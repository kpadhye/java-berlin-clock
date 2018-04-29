package com.ubs.opsit.interviews.berlinclockimpl;

import org.apache.log4j.Logger;

import com.ubs.opsit.interviews.TimeComponentConverter;
import com.ubs.opsit.interviews.constants.BerlinClockConstants;

/**
 * This class converts hours component of time to Berlin Clock representation.
 * 
 * @author Kaustubh Padhye
 *
 */
public class BerlinClockHoursConverter implements TimeComponentConverter {
	
	private static final Logger LOG=Logger.getLogger(BerlinClockHoursConverter.class);

	/**
	 * This method converts hours into Berlin clock representation of 2 rows where both rows have 4 lamps each.
	 * 
	 * @param hours hours to be converted between 0 to 24
	 */
	@Override
	public String convert(int hours) {
		LOG.debug("converting hours - "+hours);
		StringBuilder hoursRows=new StringBuilder();
		int noOfHourLightsOnFirstRow=hours / BerlinClockConstants.HOUR_LAMP_WEIGHT;
		int noOfHourLightsOnSecondRow=hours % BerlinClockConstants.HOUR_LAMP_WEIGHT;
		
		buildHoursRow(hoursRows, noOfHourLightsOnFirstRow);
		hoursRows.append(System.lineSeparator());
		buildHoursRow(hoursRows, noOfHourLightsOnSecondRow);
		LOG.debug("converted hours as - "+hoursRows.toString());
		return hoursRows.toString();
	}

	private void buildHoursRow(StringBuilder hoursRows, int noOfHourLightsOn) {
		for (int lampIndex=0;lampIndex<BerlinClockConstants.HOUR_ROW_LAMP_COUNT;lampIndex++) {
			hoursRows.append((lampIndex<noOfHourLightsOn)?BerlinClockConstants.LAMP_ON_RED:BerlinClockConstants.LAMP_OFF);
		}
	}

}
