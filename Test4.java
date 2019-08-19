package com.gyan.Threads;

class MythreadBA extends Thread
{
	@Override
	public void run() {
		System.out.println("run method");
	}
}
public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		
		MythreadBA t=new MythreadBA();
		t.start();
		System.out.println(Thread.currentThread().isInterrupted());
		t.interrupt();
		Thread.sleep(30000);
		System.out.println(t.isInterrupted());

	}

}
