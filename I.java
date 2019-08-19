package com.gyan.Threads;

public class I  {
	public static void main(String[] args) {
		Manager7 m1=new Manager7();
		m1.start();

		
			for(int i=0;i<1000;i++)
			{
				System.out.println(i);
			}
			System.out.println(10/0);
			
		
	}

}
class Manager7 extends Thread
{
	@Override
	public void run()
	{
		
		
		System.out.println("end of child");
		
	}
	
}