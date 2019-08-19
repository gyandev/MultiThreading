package com.gyan.Threads;

public class M {
	public static void main(String[] args) {
		Manager5 m1=new Manager5();
		for(int i=0;i<1000;i++)
		{
			System.out.println("parent"+ i);
		}
		
	}
	

}
class Manager5 extends Thread
{
	/*public Manager5() {
		start();
	}*/
	{
		start();
	}
	@Override
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("child" + i);
		}
	}
}
