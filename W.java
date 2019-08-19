package com.gyan.Threads;

public class W {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					System.out.println(i);
				}
			}
		}).start();
		
			for(int i=0;i<1000;i++)
			{
				System.out.println(i);
			}
		
		
	}

}
