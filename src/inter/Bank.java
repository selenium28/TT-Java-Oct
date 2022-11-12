package inter;

public interface Bank {
	
	// No method body
	// It can be achive 100% abstraction
	// Can we create object of interface?
	// No --> we can't create object of interface
	// Always define only abstact methods
	
	// this all methods are unimplimented
	public void rateOfIntrest();
	public void account();
	public void loan();
	default void cash() {
		System.out.println("Bank ---> Default method");
	}

}
