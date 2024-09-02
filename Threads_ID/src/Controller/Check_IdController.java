package Controller;

public class Check_IdController extends Thread
{

	public Check_IdController() 
	{
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void run()
	{
		int tid = (int) threadId();
		System.out.println("#"+ tid);
	}

}
