package Week3.Day1;

public class AndroidPhone extends SmartPhone{
	
	public void takeVideo(String arg)
	{
		System.out.println("Video is taken from Android");
	}
	public static void main(String[] args) {
		AndroidPhone ap = new AndroidPhone();
		ap.takeVideo();
		ap.sendMsg();
		ap.saveContact();
		ap.accessWhatsApp();
		ap.makeCall();
		ap.takeVideo();
	}

}
