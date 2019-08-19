package com.gyan.Threads;
class J1 implements Runnable
{
	@Override
	public void run()
	{
		
	}
}
public class A10 {
	public static void main(String[] args) {
		J1 j=new J1();
		Thread t1=new Thread(j);
		Thread t2=new Thread(j,"abc");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println("-------");
		t1.setName("Thread1");
		t2.setName("Thread2");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
	
}
}
