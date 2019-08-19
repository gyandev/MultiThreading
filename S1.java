package com.gyan.Threads;

class M1
{
	synchronized void test1()
	{
		for(int i=0;i<1000; i++)
		{
			System.out.println(i);
		}
	}
	synchronized void test2()
	{
		for(int i=0;i<1000; i++)
		{
			System.out.println(i);
		}
	}
}
class M2 extends Thread
{
	M1 m1;
	M2(M1 m1)
	{
		this.m1=m1;
	}
	@Override
	public void run()
	{
		m1.test2();
	}
}
class M3 extends Thread
{
	M1 m1;
	M3(M1 m1)
	{
		this.m1=m1;
	}
	@Override
	public void run()
	{
		m1.test2();
	//	m1.test1();
	}
}
public class S1 {
	public static void main(String[] args) {
		M1 m1=new M1();
		M2 m2=new M2(m1);
		M3 m3=new M3(m1);
		m2.start();
		m3.start();
		
	}

}
