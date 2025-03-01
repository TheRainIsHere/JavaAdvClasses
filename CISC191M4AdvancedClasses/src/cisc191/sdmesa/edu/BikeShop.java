package cisc191.sdmesa.edu;

import java.util.ArrayList;

/**
 * Lead Author(s):
 * @author Jade Dunne
 *  
 * Version/date: @version 03.01.25
 * 
 * Responsibilities of class:
 * To have the ability to create a shop for the cycles
 */

public class BikeShop {
	private ArrayList<Cycle> inventory = new ArrayList<Cycle>();
	private String shopName;
	
	public BikeShop(String name) {
		shopName = name;
	}
	
	/**
	 * Add a new cycle to the inventory
	 * 
	 * @param newCylce to add to the inventory
	 */
	public void addToInventory(Cycle newCylce) {
		inventory.add(newCylce);
	}
	
	@Override
	public String toString() {
		return shopName + inventory;
	}
}
