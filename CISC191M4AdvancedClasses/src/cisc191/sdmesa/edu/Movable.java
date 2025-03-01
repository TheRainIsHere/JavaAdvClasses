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
 * To provide a framework for movable objects
 */
/**
 */
public interface Movable
{
	int minSpeed = 0;
	
	/**
	 * 
	 * @return the object's current speed
	 */
	int getSpeed();
	/**
	 * increase object's speed
	 */
	void speedUp();
	/**
	 * decrease object's speed
	 */
	void speedDown();
}
