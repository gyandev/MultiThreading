package com.gyan.Threads;


 class Yeild extends Thread
{

	@Override
	public void run() {

        for (int i=0; i<5 ; i++)
            System.out.println(Thread.currentThread().getName()
                                + " in control");
	}
	
}
public class yieldDemo {
	public static void main(String[] args) {
		new Yeild().start();
		for (int i=0; i<5; i++)
        {
            // Control passes to child thread
            Thread.yield();
 
            // After execution of child Thread
            // main thread takes over
            System.out.println(Thread.currentThread().getName()
                                + " in control");
        }
		
	}

}
