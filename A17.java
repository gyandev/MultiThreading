package com.gyan.Threads;
class P1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("something");
	}
}
public class A17 {
	public static void main(String[] args) {
		 P1 p=new P1();
		 p.start();
		 p.setDaemon(true);
		 System.out.println("done");
	}

}
