package com.gyan.Threads;



class MyThreadA1 extends Thread
{
	
	@Override
	public void run() {
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException("Thread Interrupted" + e);
	//		System.out.println( e + "---Exception Handled:" );
			
		}
		System.out.println("Thread is running");
	}
}
public class StopThreadUsingInterrupt {
	public static void main(String[] args) {
		MyThreadA1 t=new MyThreadA1();
		t.start();
		t.interrupt();
		System.out.println("done");
	}
	

}
