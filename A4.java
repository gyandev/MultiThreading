package com.gyan.Threads;
class B1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("done");
		System.out.println();
	}
}
public class A4 {
	public static void main(String[] args) {
		B1 b=new B1();
		System.out.println("default properties");
		long id =b.getId();
		System.out.println("====");
		System.out.println(Thread.currentThread().getPriority());
		String name=b.getName();
		int priority=b.getPriority();
		boolean daemonStatus=b.isDaemon();
		System.out.println(id);
		System.out.println("===");
		System.out.println(name);
		System.out.println(priority);
		System.out.println(daemonStatus);
		b.start();
	}

}
