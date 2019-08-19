package com.gyan.Threads;
class MythreadA extends Thread
{
	@Override
	public void run()
	{
		System.out.println("hello");
		
		System.out.println(isInterrupted());


	}
}
public class Test1 {
	public static void main(String[] args) {
		MythreadA mt=new MythreadA();
		mt.start();
		mt.interrupt();
	}

}
