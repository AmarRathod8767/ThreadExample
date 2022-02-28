package ThreadExample;

public class RunnableThreadExample extends A implements Runnable {
    RunnableThreadExample()
    {
    	Thread t=new Thread(this);
    	t.start();
    }
  public void run() {
      for(int i=1;i<=10;i++)
      {
    	  
    	 try {
    		 System.out.println("Process "+i+super.display());
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
    }
	public static void main(String[] args) {
		RunnableThreadExample obj=new RunnableThreadExample();
		RunnableThreadExample obj1=new RunnableThreadExample();
		RunnableThreadExample obj2=new RunnableThreadExample();
		RunnableThreadExample obj3=new RunnableThreadExample();
		
		
		

	}
	
	

}
