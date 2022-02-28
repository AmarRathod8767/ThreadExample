package ThreadExample;

public class ThreadExample extends Thread{
   public  void run()
    {
	   for(int i=1;i<=10;i++)
	   {
    	
    	try {
			Thread.sleep(1000);
			System.out.println(+i+" How Are you");
		} catch (InterruptedException e) {
			
		}
    	
	   }
    }
	public static void main(String[] args) {
		ThreadExample obj=new ThreadExample();
        obj.start();
        

	}

}
