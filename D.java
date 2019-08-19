package com.gyan.Threads;

public class D {
	public static void main(String[] args) {
		Manager11 m1=new Manager11();
		m1.start();
		Manager22 m2=new Manager22();
		m2.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
		
	}

}
class Manager11 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
class Manager22 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
