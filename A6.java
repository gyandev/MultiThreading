package com.gyan.Threads;

class F1 extends Thread
{
	@Override
	public void run()
	{
		Util.getPriorities();
		System.out.println("child");
	}
}
class Util
{
	static void getPriorities()
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
public class A6 {
	public static void main(String[] args) {
		Util.getPriorities();
		System.out.println("---");
		F1 f=new F1();
		f.start();
	}

}
