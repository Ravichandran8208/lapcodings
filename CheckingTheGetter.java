package org.practise;

public class CheckingTheGetter {

	public static void main(String[] args) {
		GetMethodex ch=new GetMethodex();
int min=ch.getBalance();
System.out.println(min);
 ch.setBalance(100);
//System.out.println(min);
ch.setBalance(5000);
//System.out.println(min2);

	}

}
