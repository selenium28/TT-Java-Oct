package excep;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("Exception Handled");
			e.printStackTrace();
		}
		
		System.out.println("Rest of code");
		
		System.out.println("Additional");
		

	}

}
