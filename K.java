package com.gyan.Threads;

public class K {
	public static void main(String[] args) {
		Manager6 m1=new Manager6();
		m1.start();
		Manager14 m2=new Manager14();
		m2.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
				
	}
}
class Manager6 extends Thread
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
class Manager14 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("child begin");
		System.out.println(10/0);
		System.out.println("child end");
	}
}
