package com.gyan.Threads;
class T1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("T1 thread-" +i);
		}
	}
}
class T2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("T2 thread-"+i);
		}
	}
}
public class A19 {
	public static void main(String[] args) {
		T1 t=new T1();
		t.start();
		T2 t1=new T2();
		t1.start();
		try
		{
			t.join();
//			t1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
