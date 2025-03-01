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
 * Responsibilities of class:
 * ElectricMountainBike is a Bicyle that is Movable, Gearable, and Electric
 */

public class ElectricMountainBike extends Bicycle implements 
Gearable, Electric, Movable
// ElectricMountainBike is-a Bicyle is-a Cycle
{
	private int gear;
	private int currentCharge;
	private int currentSpeed;
	
	public ElectricMountainBike(String newMake) {
		super(newMake);
		gear = minGear;
	}

	@Override
	public int getGear() {
		return gear;
	}

	@Override
	public void gearUp() {
		if (gear < maxGear) {
			gear++;
		}
		
	}

	@Override
	public void gearDown() {
		if (gear > minGear) {
			gear--;
		}
	}

	@Override
	public int getCharge() {
		return currentCharge;
	}

	@Override
	public void charge(int addedCharge) {
		currentCharge += addedCharge;
		if (currentCharge > maxCharge) {
			currentCharge = maxCharge;
		}
	}

	@Override
	public int getSpeed() {
		return currentSpeed;
	}

	@Override
	public void speedUp() {
		currentSpeed++;
		
	}

	@Override
	public void speedDown() {
		if (currentSpeed > minSpeed) {
			currentSpeed--;
		}
		
	}
	
	
}
