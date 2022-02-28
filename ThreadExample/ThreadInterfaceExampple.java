package ThreadExample;

public class ThreadInterfaceExampple extends A implements Runnable{
	
	ThreadInterfaceExampple()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
	   
		for(int i=0;i<=10;i++)
		{
			try {
				System.out.println("Hello "+i);
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				
			}
		}
	}

	public static void main(String[] args) {
	     
		ThreadInterfaceExampple obj=new ThreadInterfaceExampple();
		//obj.start();
		ThreadInterfaceExampple obj1=new ThreadInterfaceExampple();

	}

}
