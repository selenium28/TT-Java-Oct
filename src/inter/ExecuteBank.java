package inter;

public class ExecuteBank {

	public static void main(String[] args) {
		
		HDFCBank objHDFCBank = new HDFCBank();
		objHDFCBank.account();
		objHDFCBank.cash();
		objHDFCBank.rateOfIntrest();
		objHDFCBank.loan();
		
//		Bank objBank = new Bank(); we can't create object of Bank--- why? Becoz Bank is a interface.
		
		// This is called dyanamic polymorphism
		Bank bk = new HDFCBank();
		bk.account();
		bk.cash();
		bk.rateOfIntrest();
		bk.loan();

	}

}
