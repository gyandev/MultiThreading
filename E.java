package com.gyan.Threads;

public class E {
	public static void main(String[] args) {
		Manager4 m1=new Manager4();
		m1.start();
		Manager4 m2=new Manager4();
		m2.start();
		Manager4 m3=new Manager4();
		System.out.println("done");
	}

}
class Manager4 extends Thread
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
