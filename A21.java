package com.gyan.Threads;
class T3 extends Thread
{
	@Override
	public void run(){
	
	for(int i=0;i<1000;i++)
	{
		System.out.println(i);
	
	try
	{
		sleep(30000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}
}
}
public class A21 {
	public static void main(String[] args) {
		
		T3 t=new T3();
		t.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		
	}

		
	

}
