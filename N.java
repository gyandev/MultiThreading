package com.gyan.Threads;

public class N {
	public static void main(String[] args) {
		Manager1 m1=new Manager1();
		m1.start();
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
		
	}

}
class Manager1 extends Thread
{
	public Manager1() {
		start();
	}
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
