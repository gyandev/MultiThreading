package com.gyan.Threads;

public class Q {
	public static void main(String[] args) {
		class Manager1 extends Thread
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
		Manager1 m1=new Manager1();
		m1.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}

}
