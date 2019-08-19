package com.gyan.Threads;
class Display4
{
	public static synchronized void displayn()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(i);
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	public synchronized void displayc()
	{
		for(int i=65;i<75;i++)
		{
			System.out.print((char)i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
}
class Mythread6 extends Thread
{
	Display4 d;
	public Mythread6(Display4 d) {
		this.d = d;
	}
	@Override
	public void run()
	{
		Display4.displayn();
	}
	
}
class Mythread7 extends Thread
{
	Display4 d;
	public Mythread7(Display4 d) {
		this.d = d;
	}
	@Override
	public void run()
	{
		d.displayc();
	}
	
}
public class SynchronizeDemo4 {
	public static void main(String[] args) {
		Display4 d1=new Display4();
//		Display4 d2=new Display4();
		Mythread6 mt =new Mythread6(d1);
		mt.start();
		Mythread7 mt1 =new Mythread7(d1);
		mt1.start();
		
	}

}
