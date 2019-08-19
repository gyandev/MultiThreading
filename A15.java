package com.gyan.Threads;
class N1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Hii");
	}
}
public class A15 {
	public static void main(String[] args) {
		N1 n=new N1();
		n.setDaemon(true);
		n.start();
		System.out.println(n.isDaemon());
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("done");
	}

}
