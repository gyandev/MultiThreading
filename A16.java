package com.gyan.Threads;
class O1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Hii");
	}
}
public class A16 {
	public static void main(String[] args) {
		O1 o=new O1();
		o.setDaemon(true);
		o.start();
		System.out.println(o.isDaemon());
		System.out.println("done");
	}

}
