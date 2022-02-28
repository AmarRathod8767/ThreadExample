package ThreadExample;
 class TableEx
 {
	 void table(int num)
	 {
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	 }
 }
 class TableEx1 extends Thread
 {
	 TableEx t;
	 public TableEx1(TableEx t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		t.table(10);
	 }
	 
 }


public class SyncronizeExample2 {

	public static void main(String[]args)
	{
		TableEx t=new TableEx();
		TableEx1 obj=new TableEx1(t);
		obj.start();
	}
}
