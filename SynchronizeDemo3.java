package com.gyan.Threads;
class Display3
{
	public synchronized void displayn()
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
class Mythread4 extends Thread
{
	Display3 d;
	public Mythread4(Display3 d) {
		this.d = d;
	}
	@Override
	public void run()
	{
		d.displayn();
	}
	
}
class Mythread5 extends Thread
{
	Display3 d;
	public Mythread5(Display3 d) {
		this.d = d;
	}
	@Override
	public void run()
	{
		d.displayc();
	}
	
}
public class SynchronizeDemo3 {
	public static void main(String[] args) {
		Display3 d1=new Display3();
	//	Display3 d2=new Display3();
		Mythread4 mt =new Mythread4(d1);
		mt.start();
		Mythread5 mt1 =new Mythread5(d1);
		mt1.start();
		
	}

}
