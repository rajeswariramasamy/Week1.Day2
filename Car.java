package week1.day2;

public class Car {

	public void applyBreak()
	{
		System.out.println("Apply Break");
	}
	public void applyGear()
	{
		System.out.println("Apply Gear");
	}
	public void switchOnAc()
	{
		System.out.println("Apply SwitchOnAc");
	}
	public void applyAcclerate()
	{
		System.out.println("Apply Acclerate");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.applyBreak();
		c.applyGear();
		c.switchOnAc();
		c.applyAcclerate();
	}

}
