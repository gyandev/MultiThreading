package com.gyan.Threads;

public class X {
	
	public static Runnable getRunnable()
	{
		Runnable nr=new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		};
		return nr;	
	}
	public static void main(String[] args) {
		Thread t=new Thread(getRunnable());
		t.start();
		
			for(int i=0;i<1000;i++)
			{
				System.out.println(i);
			}
		
		
	}

}
