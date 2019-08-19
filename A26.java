package com.gyan.Threads;

import java.util.Scanner;

class Counter extends Thread
{
	@Override
	public void run()
	{
		int i=0;
		System.out.println("done");
		while(isInterrupted())
		{
			i++;
		
			System.out.println(i);
			try
			{
				sleep(1);
			}
			catch(InterruptedException e)
			{
				System.out.println("exception");
				break;
			}
		}
	}
}
public class A26 {
	public static void main(String[] args) {
		Counter c=new Counter();
		c.start();
		Scanner sc=new Scanner(System.in);
		String decider=null;
		do
		{
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("continue?(y/n)");
			decider=sc.next();
		}while("y".equals(decider));
		c.interrupt();
		System.out.println("end of game");
	}

}
