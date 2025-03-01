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
 * A a Bicycle is a Cycle with two wheels
 */


public class Bicycle extends Cycle		// Biycle is-a Cycle
{
	public Bicycle(String newMake) {
		super(newMake);
		wheelCount = 2;
	}
	
	/**
	 * 
	 * @return the number of wheels
	 */
	public int getNumberOfWheels() {
		return wheelCount;
	}
	
	/**
	 * 
	 * @return the color of the bike
	 */
	public Color getColor() {
		return cycleColor;
	}
	
	/**
	 * Changes the color of the bike
	 * 
	 * @param newColor to set the bike to
	 */
	public void setColor(Color newColor) {
		cycleColor = newColor;
	}
}
