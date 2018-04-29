package com.ubs.opsit.interviews.berlinclockimpl;

import org.apache.log4j.Logger;

import com.ubs.opsit.interviews.TimeComponentConverter;
import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.TimeValidator;
import com.ubs.opsit.interviews.constants.BerlinClockConstants;

/**
 * This class converts the time to berlin clock representation of 5 rows.
 *  * 
 * @author Kaustubh Padhye
 *
 */
public class BerlinClockTimeConverter implements TimeConverter {

	private static final Logger LOG = Logger.getLogger(BerlinClockTimeConverter.class);  
	
	private TimeComponentConverter secondsConverter=new BerlinClockSecondsConverter();
	private TimeComponentConverter hoursConverter=new BerlinClockHoursConverter();
	private TimeComponentConverter minutesConverter=new BerlinClockMinutesConverter();
	private TimeValidator validator=new BerlinClockInputTimeValidator();
	
	/**
	 * This method converts time with format of hh:mm:ss to berlin clock format of 5 rows.
	 * First row represents seconds, next 2 rows represent hours and last 2 rows represent minutes.
	 * Before going for conversion, it checks if the time that is passed to it is valid.
	 * 
	 * @param aTime time in hh:mm:ss format that is to be converted to berlin time.
	 */
	@Override
	public String convertTime(String aTime) {
		LOG.info("Converting time - "+ aTime);
		validator.validate(aTime);
		LOG.info("Time is valid");
		String[] timeComponents=aTime.split(BerlinClockConstants.TIME_COMPONENT_SEPARATOR);
		
		int hours=Integer.parseInt(timeComponents[0]);
		int minutes=Integer.parseInt(timeComponents[1]);
		int seconds=Integer.parseInt(timeComponents[2]);
		
		StringBuilder convertedTime=new StringBuilder();
		convertedTime.append(secondsConverter.convert(seconds));
		convertedTime.append(System.lineSeparator());
		convertedTime.append(hoursConverter.convert(hours));
		convertedTime.append(System.lineSeparator());
		convertedTime.append(minutesConverter.convert(minutes));
		
		LOG.info("Converted time is "+convertedTime.toString());
		return convertedTime.toString();
	}

}
