package com.gyan.Threads;


class Mythread extends Thread
{
	static Thread mt;
	@Override
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<20;i++)
		{
			System.out.println("seeta -"+i);
		}
	}
	}

public class Test {
	
public static void main(String[] args) throws InterruptedException {
	Mythread.mt=Thread.currentThread();
	Mythread t=new Mythread();
	t.start();
//	mt.join();
	for(int i=0;i<10;i++)
	{
		System.out.println("Rama-" +i);
		Thread.sleep(1000);
		
	}
	
	
}
}
