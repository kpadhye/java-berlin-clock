package com.ubs.opsit.interviews;

/**
 * Interface to validate the input time.
 * 
 * @author Kaustubh Padhye
 *
 */
public interface TimeValidator {

	/**
	 * This method validates the time that is to be converted.
	 * 
	 * @param time time to be converted.
	 */
	public void validate(String time);
	
}
