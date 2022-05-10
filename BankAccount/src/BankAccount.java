
public class BankAccount {
	private String accntHolderName;
	private double accntBalance;
	
	//constructor
	public BankAccount(String holderName, double accntBal) {
		this.accntBalance = accntBal;
		this.accntHolderName = holderName;
	}
	
	//Deposit amt
	private void depositAmount(double depositAmt) {
		accntBalance += depositAmt;
	}
	
	//withdraw amt
	private void withdrawal(double withdrawAmt) {
		accntBalance -= withdrawAmt;
	}

	//print account details
	private void printAccountDetails() {
		System.out.println(accntHolderName+" account balance: "+accntBalance);
	}
	
	public static void main(String[] args) {
		//Bank Account
		BankAccount bankAct =  new BankAccount("My", 500);
		bankAct.depositAmount(100);
		bankAct.printAccountDetails();
		
		//Bank Transfer
		BankAccount firstAccnt =  new BankAccount("Lary's", 5000);
		BankAccount secondAccnt =  new BankAccount("Mary's", 300);
		firstAccnt.withdrawal(100);
		secondAccnt.depositAmount(100);
		firstAccnt.printAccountDetails();
		secondAccnt.printAccountDetails();
	}
}
