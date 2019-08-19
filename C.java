package com.gyan.Threads;

public class C {
	public static void main(String[] args) {
		MyRunnable nr=new MyRunnable();
		Thread t=new Thread(nr);
		t.start();
		
			for(int i=0;i<1000;i++)
			{
				System.out.println(i);
			}
		
	}
	

}
class MyRunnable implements Runnable
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