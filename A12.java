package com.gyan.Threads;

class K1 extends Thread
{
	
}
public class A12 {
	public static void main(String[] args) {
		K1 k=new K1();
		System.out.println(k.getPriority());
		System.out.println(Thread.currentThread().getPriority());
		Thread t=Thread.currentThread();
		t.setPriority(10);
		K1 k1=new K1();
		System.out.println(k1.getPriority());
	}

}
