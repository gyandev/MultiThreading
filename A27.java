package com.gyan.Threads;
class N11
{
	synchronized void test1()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("test1:"+ i);
		}
	}
	synchronized void test2()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("test2:"+i);
		}
	}
}
class N2 extends Thread
{
	N11 n;
	N2(N11 n)
	{
		this.n=n;
	}
	@Override
	public void run()
	{
		n.test1();
	}
}
class N3 extends Thread
{
	N11 n;
	N3(N11 n)
	{
		this.n=n;
	}
	@Override
	public void run()
	{
		n.test2();
	}
}
public class A27 {
	public static void main(String[] args) {
		N11 n1=new N11();
		N11 n=new N11();
		N2 n2=new N2(n1);
		N3 n3=new N3(n);
		n2.start();
		n3.start();
	}

}
