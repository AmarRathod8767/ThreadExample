package ThreadExample;
 class Table3 
{
 synchronized public void demo(int num)
  {
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(num*i);
		 try {
		//	 if(i>=5) {
			Thread.sleep(1000);
				// wait(3000);
				// notify();//it Will use to start run
			// }
			// else
			// {
				// wait(1000);
				 //Thread.sleep(1000);
			// }
		} catch (InterruptedException e) {
			
		}
	  }
  }
	
}
class TableEx3 extends Thread
 {    Table3 t;
 
	 TableEx3(Table3 t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.demo(10);
	 }
 }
class TableEx4 extends Thread
{
	Table3 t;
	TableEx4(Table3 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.demo(5);
	}
}
class TableEx5 extends Thread
{
	Table3 t;
 TableEx5(Table3 t)
 {
	 this.t=t;
	 
 }
 public void run()
 {
	 t.demo(3);
 }
}

public class SyncronizedExample3 {

	public static void main(String[] args) {
		Table3 obj=new Table3();
		TableEx3 tbj=new TableEx3(obj);
		tbj.start();
		//obj.join(1000);
		TableEx4 t4=new TableEx4(obj);
		t4.start();

		TableEx5 t5=new TableEx5(obj);
		t5.start();

	}

}
