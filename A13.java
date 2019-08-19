package com.gyan.Threads;

class L1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("L1:" +getPriority());
	}
}
class L2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("L2:" +getPriority());
		setPriority(8);
		L1 l=new L1();
		l.start();
	}
}
public class A13 {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(6);
		//		t.setPriority(6);
				L2 l=new L2();
				l.start();
	}
	

}
