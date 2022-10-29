package oopsConcept;

public class MethodOverloading {
	
	// MethodOverloading--> When the method name is same with different input parameters within the same class.
	// Duplicate methods are not allowed.
	// Can we overload main method?   ---> Yes
	// This is not a good pratice, or compiler will confused.
	// Method inside method is not allowed

	public static void main(String[] args) {
		
		MethodOverloading objMethodOverloading = new MethodOverloading();
		objMethodOverloading.pratik();
	}

	// 0 input parameter
	public void pratik() {
		System.out.println("0 input parameter");
	}

	// 1 input parameter
	public void pratik(int i) {
		System.out.println("1 input parameter");
	}

	// 2 input parameters
	public void pratik(int x, int y) {
		System.out.println("2 input parameters");
	}

	// 1 input parameter but different datatype
	public void pratik(double d) {
		System.out.println("1 input parameter  --> Double");
	}

}
