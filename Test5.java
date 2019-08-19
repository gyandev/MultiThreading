package com.gyan.Threads;

import java.util.Hashtable;

public class Test5 extends Thread {
	
	public  void test()
	{
		synchronized(this)
		{
			for(int i=0;i<100;i++)
			{
				System.out.println("Test5 " + i);
			}
		}

	}
	public  void test1()
	{
		synchronized(Test5.class)
		{
			for(int i=0;i<100;i++)
			{
				System.out.println("Test1 " + i);
			}
		}
		synchronized(Test5.class)
		{
			for(int i=0;i<1000;i++)
			{
				System.out.println("Test1 " + i);
			}
		}


	}
	
	@Override
	public void run() {
		test();
		test1();
		
	}
	public static void main(String[] args) {
		Object obj=new Object();
		
		Test5 mt1=new Test5();
		mt1.start();
//		mt1.test1();
//		Test5 mt2=new Test5();
//		mt2.start();
		
	}

}
