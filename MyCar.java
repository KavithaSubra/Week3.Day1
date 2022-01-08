package Week3.Day1;

public class MyCar extends Car {
	
	public void color()
	{
		System.out.println("Print the color");
	}
	
	public static void main(String[] args) {
		MyCar myCar=new MyCar();
		myCar.color();//access self function
		myCar.fuelType();//from parent
		
		/*Vehicle veh = new Vehicle();
		veh.applyBrake();
		veh.soundHorn();*/
		//Concept of inheritance - once the Car class is extended to Vehicle class
		myCar.applyBrake();//from grandparent
		myCar.soundHorn();//from grandparent
	}

}
