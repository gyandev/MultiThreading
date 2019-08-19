package com.gyan.Threads;

class ThreadUtil
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class W1 extends Thread
{
	@Override
	public void run(){
		
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
		
			ThreadUtil.sleep(1000);
	}
}
class W2 extends Thread
{
	@Override
	public void run(){
		
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
		
			ThreadUtil.sleep(1000);
	}
}
public class A23 {
	public static void main(String[] args) {
		W1 w=new W1();
		w.start();
		W2 w1=new W2();
		w1.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}
