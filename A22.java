package com.gyan.Threads;

class Y1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i + ","+isInterrupted());
		}
	}
}
public class A22 {
	public static void main(String[] args) {
		Y1 y=new Y1();
		y.start();
		ThreadUtil.sleep(1);	
		y.interrupt();
		System.out.println("done");
	}

}
