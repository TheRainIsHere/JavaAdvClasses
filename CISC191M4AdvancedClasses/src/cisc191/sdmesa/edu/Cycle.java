package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author Jade Dunne
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: @version 03.01.25
 * 
 * Responsibilities of class:
 * To provide a basic cycle class for multiple types of cycles to inherit from
 */

public abstract class Cycle
{	
	String make;
	int wheelCount;
	Color cycleColor;
	private static int totalCycles = 0;
	private final int frameNumber;
	
	public Cycle(String newMake)
	{
		make = newMake;
		totalCycles++;
		frameNumber = totalCycles;
	}

	abstract int getNumberOfWheels();

	/**
	 * 
	 * @return the color of the bike; can be null
	 */
	abstract Color getColor();

	/**
	 * Changes the color of the bike
	 * 
	 * @param newColor
	 */
	abstract void setColor(Color newColor);

	/**
	 * 
	 * @return make or brand that was set when the bike was made
	 */
	public String getMake()
	{
		return make;
	}
	
	/**
	 * 
	 * @return the unique serial number that was stamped in the frame when the bike was made
	 * @see https://www.eta.co.uk/bicycle-insurance/frequently-asked-questions/how-to-find-a-bicycle-frame-number/
	 */
	public int getFrameNumber()
	{
		return frameNumber;
	}
	
	/**
	 * @return String describing the object, including type, make and frame number
	 */
	@Override
	public String toString()
	{
		return make + cycleColor + frameNumber;
	}

}
