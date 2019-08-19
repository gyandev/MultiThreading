package com.gyan.Threads;

public class R {
	public static void main(String[] args) {
		class Manager1 implements Runnable
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
		Thread t=new Thread(m1);
		t.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}

}
