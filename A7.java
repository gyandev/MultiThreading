package com.gyan.Threads;

class G1 extends Thread
{
	
}
public class A7 {
	public static void main(String[] args) {
		G1 g1=new G1();
		G1 g2=new G1();
		System.out.println(g1.getId());
		System.out.println(g2.getId());
		
	}

}
