package Week3.Day1;

public class Mobile {
	
	public void sendMsg()
	{
		System.out.println("Send a Message");
	}
	public void makeCall()
	{
		System.out.println("Make a call");
	}
	public void saveContact()
	{
		System.out.println("Save the Contact");
	}
	public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.sendMsg();
	mob.makeCall();
	mob.saveContact();
	
	}

}
