package com.gyan.Threads;

class MyThreadAQ extends Thread
{
	
	@Override
	public void run() {
		try
		{
			System.out.println(isInterrupted());
			for(int i=0;i<10;i++)
			{
				System.out.println("hii Anzel-I m sleeping");
				Thread.sleep(2000);
		//		System.out.println(isInterrupted());
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(isInterrupted());
			System.out.println("Yes I got interrupted");
			
		}
		
	}
}
public class InteruptedDemo {
	public static void main(String[] args) {
		MyThreadAQ t=new MyThreadAQ();
		t.start();
		t.interrupt();
		System.out.println("done");
	}
	

}
