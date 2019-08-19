package com.gyan.Threads;
class Display1
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning :");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
}
class Mythread2 extends Thread
{
	Display1 d;
	String name;
	public Mythread2(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run()
	{
		d.wish(name);
	}
	
}
public class SynchronizeDemo1 {
	public static void main(String[] args) {
		Display1 d1=new Display1();
		Display1 d2=new Display1();
		Mythread2 mt =new Mythread2(d1, "gyan");
		mt.start();
		Mythread2 mt1 =new Mythread2(d2, "Anurag");
		mt1.start();
		
	}

}
