package com.gyan.Threads;
class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning :"+i);
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
class Mythread1 extends Thread
{
	Display d;
	String name;
	public Mythread1(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run()
	{
		d.wish(name);
		
		
	}
	
}
public class SynchronizeDemo {
	public static void main(String[] args) {
		Display d=new Display();
		Mythread1 mt =new Mythread1(d, "gyan");
		mt.start();
		Mythread1 mt1 =new Mythread1(d, "Hatim");
		mt1.start();
		
	}

}
