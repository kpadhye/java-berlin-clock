package com.ubs.opsit.interviews.constants;

/**
 * This interface contains various constants.
 * 
 * @author Kaustubh Padhye
 *
 */
public interface BerlinClockConstants {
	
	public static final String LAMP_OFF="O";
	
	public static final String LAMP_ON_YELLOW="Y";
	
	public static final String LAMP_ON_RED="R";
	
	public static final String TIME_COMPONENT_SEPARATOR = ":";

	public int MINUTES_SECOND_ROW_LAMP_COUNT = 4;

	public int MINUTES_FIRST_ROW_LAMP_COUNT = 11;

	public int MINUTE_LAMP_WEIGHT = 5;

	public String VALID_TIME_FORMAT = "(([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9])|(24:00:00)";

	public int HOUR_LAMP_WEIGHT = 5;

	public int HOUR_ROW_LAMP_COUNT = 4;
}
