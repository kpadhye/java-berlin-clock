package com.ubs.opsit.interviews.berlinclockimpl;

import org.apache.log4j.Logger;

import com.ubs.opsit.interviews.TimeComponentConverter;
import com.ubs.opsit.interviews.constants.BerlinClockConstants;

/**
 * This class converts minutes component of time to Berlin Clock representation.
 * 
 * @author Kaustubh Padhye
 *
 */
public class BerlinClockMinutesConverter implements TimeComponentConverter {
	
	private static final Logger LOG=Logger.getLogger(BerlinClockMinutesConverter.class);

	/**
	 * This method converts minutes into Berlin clock representation of 2 rows.
	 * First row has 11 lamps and second row has 4 lamps.
	 * 
	 * @param minutes minutes to be converted between 0 to 59
	 */
	@Override
	public String convert(int minutes) {
		LOG.debug("converting minutes - "+minutes);
		StringBuilder minutesRows=new StringBuilder();
		
		prepareMinutesFirstRow(minutes, minutesRows);
		
		minutesRows.append(System.lineSeparator());
		
		prepareMinutesSecondRow(minutes, minutesRows);
		LOG.debug("converted minutes as - "+minutesRows.toString());
		return minutesRows.toString();
	}
	
	private void prepareMinutesFirstRow(int minutes, StringBuilder minutesRows) {
		LOG.debug("Preparing first row for minutes");
		int noOfMinutesLightsFirstRow=minutes / BerlinClockConstants.MINUTE_LAMP_WEIGHT;
		
		for (int lampIndex=0; lampIndex < BerlinClockConstants.MINUTES_FIRST_ROW_LAMP_COUNT; lampIndex++) {
			if (lampIndex<noOfMinutesLightsFirstRow) {
				if ((lampIndex+1)%3==0) {
					minutesRows.append(BerlinClockConstants.LAMP_ON_RED);//every third lamp is red
				}
				else {
					minutesRows.append(BerlinClockConstants.LAMP_ON_YELLOW);// all other lamps are yellow
				}
			}
			else {
				minutesRows.append(BerlinClockConstants.LAMP_OFF);
			}
		}
		LOG.debug("Prepared first row for minutes. Count of lamps switched on = "+noOfMinutesLightsFirstRow);
	}

	private void prepareMinutesSecondRow(int minutes, StringBuilder minutesRows) {
		LOG.debug("Preparing second row for minutes");
		int noOfMinutesLightsSecondRow=minutes % BerlinClockConstants.MINUTE_LAMP_WEIGHT;
		for (int lampIndex=0;lampIndex<BerlinClockConstants.MINUTES_SECOND_ROW_LAMP_COUNT;lampIndex++) {
			minutesRows.append((lampIndex < noOfMinutesLightsSecondRow)?BerlinClockConstants.LAMP_ON_YELLOW : BerlinClockConstants.LAMP_OFF);
		}
		LOG.debug("Prepared second row for minutes. Count of lamps switched on = "+noOfMinutesLightsSecondRow);
	}

	

}
