package com.gyan.Threads;

public class V {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
					for(int i=0;i<1000;i++)
					{
						System.out.println(i);
					}
				
			}
		});
		
	t.start();
	
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
	
	}

}
