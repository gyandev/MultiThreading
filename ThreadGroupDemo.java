package com.gyan.Threads;

public class ThreadGroupDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().activeCount());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println(Thread.currentThread().getThreadGroup().activeGroupCount());
//		System.out.println(Thread.currentThread().getThreadGroup().list());
		System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
		
	}
	

}
