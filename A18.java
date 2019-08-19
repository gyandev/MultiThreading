package com.gyan.Threads;
class S11 extends Thread
{
	static Thread mt;
	@Override
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=100;i<1000;i++)
		{
			System.out.println("S1 thread-" +i);
			
		}
	}
}
public class A18 {
	public static void main(String[] args) throws InterruptedException {
		S11.mt=Thread.currentThread();
		S11 t=new S11();
		t.start();
		t.join();
		for(int i=0;i<1000;i++)
		{
			System.out.println("main thread-" +i);
		}
	}

}
