package com.gyan.Threads;

class I1 extends Thread
{
	I1(String name)
	{
		super(name);
	}
	I1()
	{
		
	}
}
public class A9 {
	public static void main(String[] args) {
		I1 i=new I1();
		I1 i1=new I1("abc");
		System.out.println(i.getName());
		System.out.println(i1.getName());
		System.out.println("-------");
		i.setName("thread1");
		i1.setName("thread2");
		System.out.println(i.getName());
		System.out.println(i1.getName());
		
		
	}

}
