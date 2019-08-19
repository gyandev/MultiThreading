package com.gyan.Threads;

public class G {
	public static void main(String[] args) {
		Manager9 m1=new Manager9();
		m1.start();
		Manager2 m2=new Manager2();
		Thread t=new Thread(m2);
		t.start();
		System.out.println("done");
		
		
	}

}
class Manager9 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
class Manager2 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
