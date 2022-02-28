package ThreadExample;
class Fibonacci
{
	synchronized public void fibo(int fnum)
   {
	   int a=1,b=-1;
	   
	   for(int i=1;i<=fnum;i++)
	   {
		   
		   int c=a+b;
		   System.out.println(c);
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		   b=a;
		   a=c;
	   }
   }

}
class Tablefi
{
synchronized	public void table(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+num+"="+num*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
			
		}
	}
}
class FibTab extends Thread
{   Fibonacci fnum;
    Tablefi num;
    FibTab(Fibonacci fnum, Tablefi num)
    {
    	this.fnum=fnum;
    	this.num=num;
    }
	public void run()
	{
		fnum.fibo(5);
		num.table(5);
		
	}

}

class FibTab1 extends Thread
{   Fibonacci fnum;
    Tablefi num;
    FibTab1(Fibonacci fnum, Tablefi num)
    {
    	this.fnum=fnum;
    	this.num=num;
    }
	public void run()
	{
		fnum.fibo(5);
		num.table(3);
		
	}

}


public class FibonacciExample {

	public static void main(String[] args) {
		Fibonacci fobj=new Fibonacci();
		Tablefi tobj=new Tablefi();
		FibTab ft=new FibTab(fobj, tobj);
		ft.start();
		FibTab1 ft1=new FibTab1(fobj, tobj);
		ft1.start();

	}

}
