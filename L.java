package com.gyan.Threads;

public class L {
	public static void main(String[] args) {
		Manager3 m1=new Manager3();
		m1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}

}
class Manager3 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("begin");
		start();
		System.out.println("end");
		
	}
}

