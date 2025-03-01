package cisc191.sdmesa.edu;

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
 * Responsibilities of interface:
 * To provide a framework for gearable vehicles
 */
public interface Gearable
{
	int minGear = 1;
	int maxGear = 21;
	
	/**
	 * 
	 * @return the gear that object is currently in
	 */
	int getGear();
	/**
	 * Increase the gear the vehicle is in
	 */
	void gearUp();
	/**
	 * Decrease the gear the vehicle is in
	 */
	void gearDown();
}
