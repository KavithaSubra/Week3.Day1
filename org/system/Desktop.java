package org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("Desktop size from Desktop class");
	}
	public static void main(String[] args) {
		Desktop desk1 = new Desktop();
		desk1.computerModel();
		desk1.desktopSize();
		
	}
}
