package org.practise;

import org.testng.annotations.Test;

public class Addmethod {
	public void Addition(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
		

	}
	@Test
	public  void main() {
			Addmethod add=new Addmethod();
			add.Addition(10, 10);
			
	}
	

}
