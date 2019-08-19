package com.gyan.Threads;
class Display2
{
	public static synchronized void wish(String name)
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
class Mythread3 extends Thread
{
	Display2 d;
	String name;
	public Mythread3(Display2 d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run()
	{
		Display2.wish(name);
	}
	
}
public class SynchronizeDemo2 {
	public static void main(String[] args) {
		Display2 d1=new Display2();
		Display2 d2=new Display2();
		Mythread3 mt =new Mythread3(d1, "gyan");
		mt.start();
		Mythread3 mt1 =new Mythread3(d2, "Amit");
		mt1.start();
		
	}

}
