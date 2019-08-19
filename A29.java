package com.gyan.Threads;
class N4
{
	synchronized void test1()
	{
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
			System.out.println("hello");
			
	}
	
	synchronized void test2()
	{
		
	
		System.out.println("Hi");
	
//		notify();
		notifyAll();
	}
}
class N5 extends Thread
{
	N4 n;
	N5(N4 n)
	{
		this.n=n;
	}
	@Override
	public void run()
	{
		n.test1();
	}
}
class N6 extends Thread
{
	N4 n;
	N6(N4 n)
	{
		this.n=n;
	}
	@Override
	public void run()
	{
		n.test2();
	}
}
public class A29 {
	public static void main(String[] args) {
		N4 n1=new N4();
		N5 n2=new N5(n1);
		N6 n3=new N6(n1);
		n2.start();
		n3.start();
	}

}
