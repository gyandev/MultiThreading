package com.gyan.Threads;

public class ThreadGroupDemo1 {
	public static void main(String[] args) {
	//	ThreadGroup t=new ThreadGroup();
		ThreadGroup tg=new ThreadGroup("Gyan Group");
		ThreadGroup tg1=new ThreadGroup(tg,"Gyan Group1");
		System.out.println(tg.getParent().getName());
		System.out.println(tg1.getParent().getName());
		System.out.println(tg1.getName());
	}
	

}
