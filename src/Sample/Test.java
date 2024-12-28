package Sample;
class RBIBank {
	int balance;
	void deposit(int amt) {
		this.balance=this.balance+amt;
		System.out.println("from RBI successfully deposited....amount...."+amt);
	}
	void withdraw(int amt) {
		this.balance=this.balance-amt;
		System.out.println("from RBI successfully withdrawn....amount...."+amt);
	
	}
	void checkbalance() {
		System.out.println("from RBI avl balance...."+this.balance);
	}
}

class SBIBank extends RBIBank{
	public SBIBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if(amt<50000) {
		this.balance=this.balance+amt;
		System.out.println("from SBI successfully deposited....amount...."+amt);
	
	} else {
		System.out.println("from SBI day limit exceeds");
		
	}
}
	void withdraw(int amt) {
		if(amt<50000) {
		this.balance=this.balance-amt;
		System.out.println("from SBI successfully withdrawn....amount...."+amt);
	
	} else {
		System.out.println("from SBI day limit exceeds");
		
	}
}
}

class ICICIBank extends RBIBank{
	public ICICIBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if(amt<200000) {
		this.balance=this.balance+amt;
		System.out.println("from ICICI successfully deposited....amount...."+amt);
	
	} else {
		System.out.println("from ICICI day limit exceeds");
		
	}
}
	void withdraw(int amt) {
		if(amt<200000) {
		this.balance=this.balance-amt;
		System.out.println("from ICICI successfully withdrawn....amount...."+amt);
	
	} else {
		System.out.println("from ICICI day limit exceeds");
		
	}
}
}



class HDFCBank extends RBIBank{
	public HDFCBank(int balance) {
		this.balance=balance;
	}
	void deposit(int amt) {
		if(amt<500000) {
		this.balance=this.balance+amt;
		System.out.println("from HDFC successfully deposoited amt...."+amt);
	} else {
		System.out.println("from HDFC day limit exceeds");
		
	}
}
	void withdraw(int amt) {
		if(amt<500000) {
		this.balance=this.balance-amt;
		System.out.println("from HDFC successfully withdrawn....amount...."+amt);
	
	} else {
		System.out.println("from HDFC day limit exceeds");
		
	}
}
}

public class Test {

	public static void main(String[] args) {
		SBIBank sbi=new SBIBank(10000);
		ICICIBank icici=new ICICIBank(75000);
		HDFCBank hdfc=new HDFCBank(85000);
		
		System.out.println("for SBIBank starts....");
		sbi.checkbalance();
		sbi.deposit(6000);
		sbi.checkbalance();
		sbi.deposit(67000);
		sbi.checkbalance();
		System.out.println("for SBIBank ends....");
		
		System.out.println("for ICICIBank starts....");
		icici.checkbalance();
		icici.deposit(6000);
		icici.checkbalance();
		icici.deposit(67000);
		icici.checkbalance();
		System.out.println("for ICICIBank ends....");
		
		
		System.out.println("for HDFCBank starts....");
		hdfc.checkbalance();
		hdfc.deposit(6000);
		hdfc.checkbalance();
		hdfc.deposit(67000);
		hdfc.checkbalance();
		System.out.println("for HDFCBank ends....");
		
		
		
		

		


		

	}

}