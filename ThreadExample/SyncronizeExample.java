package ThreadExample;
class  Table
{
	 void tabel(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*n);
			//try {
			//Thread.sleep(1000);
			//} catch (InterruptedException e) {
				
		//	}
		}
	}
}
class Thread1 extends Thread
{
  Table t;
  public Thread1(Table t)
  
  {
	  this.t=t;
  }
  public void run()
  {
	  t.tabel(5);
  }
  
}
class Thread2 extends Thread
{
  Table t;
  public Thread2(Table t)
  
  {
	  this.t=t;
  }
  public void run()
  {
	  t.tabel(10);
  }
  
}
public class SyncronizeExample {

	public static void main(String[] args) {
		Table t=new Table();
		Thread1 t1=new Thread1(t);
		t1.start();
		Thread2 t2=new Thread2(t);
		t2.start();
		

	}

}
