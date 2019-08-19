package com.gyan.Threads;

public class U {
	public static void main(String[] args) {
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
		Thread t =new Thread(nr);
		t.start();
		
			for(int i=0;i<1000;i++)
			{
				System.out.println(i);
			}
		
	
		
	}

}
