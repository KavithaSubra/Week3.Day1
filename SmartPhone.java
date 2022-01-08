package Week3.Day1;

public class SmartPhone extends Mobile{
	public void accessWhatsApp()
	{
		System.out.println("WhatsApp is accessed");
	}
	
	public void takeVideo()
	{
		System.out.println("Video is taken from SmartPhone");
	}
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.accessWhatsApp();
		sp.saveContact();
		sp.sendMsg();
		sp.makeCall();
		
	}
	

}
