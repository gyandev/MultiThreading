package com.gyan.Threads;

class H1 extends Thread
{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class A8 {
	public static void main(String[] args) {
		H1 h1=new H1();
		H1 h2=new H1();
		h1.start();
	
		System.out.println(h1.getName());
		System.out.println(h2.getName());
		System.out.println(Thread.currentThread().getName());
		h1.setName("abc");
		h2.setName("xyz");
		Thread.currentThread().setName("gyan");
		System.out.println("-------");
		System.out.println(h1.getName());
		System.out.println(h2.getName());
		System.out.println(Thread.currentThread().getName());
		
	}
	

}
