package org.practise;

public class ChildClassfortAbstract extends AbstractEx {

	public static void main(String[] args) {
		
		ChildClassfortAbstract bb= new ChildClassfortAbstract();
		bb.BankBalance();
		bb.bankIntresrt();
		bb.balance();

	}

	@Override
	void bankIntresrt() {
	System.out.println("4.3%");
		
	}
	private void balance() {
		System.out.println("r6444i");

	}
	

}
