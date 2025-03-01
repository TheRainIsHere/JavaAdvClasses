package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Jade Dunne
 *  
 * Version/date: @version 03.01.25
 * 
 * Responsibilities of interface:
 * To provide a framework for electric vehicles
 */
public interface Electric {
	int minCharge = 0;
	int maxCharge = 100;
	
	/**
	 * 
	 * @return the vehicle's charge
	 */
	int getCharge();
	/**
	 * Increase the charge of the vehicle
	 * 
	 * @param addedCharge to the current charge of the vehicle
	 */
	void charge(int addedCharge);
}
