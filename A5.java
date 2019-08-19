package com.gyan.Threads;
class C1 extends Thread
{
	
}
class C2 extends Thread
{
	
}
class C3 extends Thread
{
	
}
class C4 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class A5 {
	public static void main(String[] args) {
		C1 c1=new C1();
		C2 c2=new C2();
		C3 c3=new C3();
		C4 c4=new C4();
		Thread t=new Thread();
		Thread t1=new Thread(c4);
		printProperties(c1);
		System.out.println("----");
		printProperties(c2);
		System.out.println("----");
		printProperties(c3);
		System.out.println("----");
		printProperties(t);
		System.out.println("----");
		printProperties(t1);
	}
	static void printProperties(Thread t)
	{
	//	System.out.println(t.getState());
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isDaemon());
	}

}
