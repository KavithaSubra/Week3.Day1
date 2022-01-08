package Week3.Day1;

public class Vehicle {
	public void applyBrake()
	{
		System.out.println("Brake is applied from vehicle");
	}
	
	public void soundHorn()
	{
		System.out.println("Sound horn");
	}
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.applyBrake();
		veh.soundHorn();
	}
	

}
