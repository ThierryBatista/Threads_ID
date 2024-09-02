package view;
import Controller.Check_IdController;

public class Check_Id {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++)
		{
		Thread t = new Check_IdController();
		t.start();
		}
	}

}
