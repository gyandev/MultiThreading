package com.gyan.Threads;

public class B {
	public static void main(String[] args) {
		Manager mt=new Manager();
		mt.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println("child-" + i);
		}
		
	}
	
}
class Manager extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("main-"+ i);
		}
	}
	
}
