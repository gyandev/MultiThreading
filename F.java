package com.gyan.Threads;

public class F {
	public static void main(String[] args) {
		Manager10 m1=new Manager10();
		Thread t1=new Thread(m1);
		t1.start();
		Thread t2=new Thread(m1);
		t2.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
	

}
class Manager10 implements Runnable
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
