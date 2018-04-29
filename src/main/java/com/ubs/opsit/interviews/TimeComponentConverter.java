package com.ubs.opsit.interviews;

/**
 * This is the interface that declares methods to convert individual time components to their respective target representation.
 * 
 * @author Kaustubh Padhye
 *
 */
public interface TimeComponentConverter {

	/**
	 * This method will convert individual time component (hours/minutes/seconds) to its respective target representation.
	 * 
	 * @param componentValue
	 * @return target String representation.
	 */
	String convert(int componentValue);

}
