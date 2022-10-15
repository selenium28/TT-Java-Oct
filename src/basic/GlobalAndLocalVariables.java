package basic;

public class GlobalAndLocalVariables {
	int num = 100;
	static String name = "Rahul"; // Global Variable  -  Scopeof the Global variables within the class

	public static void main(String[] args) {
		
		int a = 10;  // local variable - Scope of the local variables within the method.
		int b = 20;
		System.out.println(a+b);
		System.out.println(name);
		sum();  // Static method --> direct calling 
		GlobalAndLocalVariables obj = new GlobalAndLocalVariables();
		obj.display();  // non-static method --> By using object
		
	}
	
	public void display() {
		System.out.println("Display");
	}
	
	public static void sum() {
		int m = 200;
		
		GlobalAndLocalVariables objSum = new GlobalAndLocalVariables();
		
		System.out.println(m+objSum.num);
		
	}

}
