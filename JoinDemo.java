package com.gyan.Threads;
class SS1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("S1 thread:"+i);
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		SS1 s=new SS1();
		s.start();
		try
		{
			s.join(5);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		for(int i=0;i<1000; i++)
		{
			System.out.println("main:"+i);
		}

	}

}
