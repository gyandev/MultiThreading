package com.gyan.Threads;



public class H {
	public static void main(String[] args) {
		Manager8 m1=new Manager8();
		m1.start();
		Manager13 m2=new Manager13();
		Thread t=new Thread(m2);
		t.start();
		System.out.println("done");
		t.start();
		
		
	}

}
class Manager8 extends Thread
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
class Manager13 implements Runnable
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

