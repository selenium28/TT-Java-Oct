package basic;

public class MethodsClass {

	public static void main(String[] args) {
		
		MethodsClass obj = new MethodsClass();
		obj.display();
		int c = obj.sum();
//		System.out.println(obj.sum());
		System.out.println(c);
		int z = obj.test(100, 200);
		System.out.println(z);
	}
	
	// void --> No return type
	public void display() {
		System.out.println("Display Method");
	}
	
	// int --> Return int value
	public int sum() {
		int a = 10;
		int b = 20;
		System.out.println("Sum Method");
		return a+b;
		
	}
	
	public int test(int x, int y) {
	int m = x+y;
	System.out.println("Test Method");
	return m;
	
	}
}
