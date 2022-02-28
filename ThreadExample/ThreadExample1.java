package ThreadExample;

public class ThreadExample1 extends Thread {
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Process "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				

			}
		}
	}
	
	public static void main(String[]args)
	{
		ThreadExample1 te=new ThreadExample1();
		te.start();
		
		ThreadExample1 te1=new ThreadExample1();
		te1.start();
	}
	

}
