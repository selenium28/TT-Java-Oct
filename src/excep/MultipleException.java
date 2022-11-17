package excep;

public class MultipleException {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			a[7] = 10/5;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Handled");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Handled");
		} catch (Exception e) {
			System.out.println("Normal Exception");
		}
		
		System.out.println("Remaining Code");
		
		try {
			int m = 10;
			int n = 0;
			System.out.println(m/n);
		} finally {
			System.out.println("Finally Block ");
		}
		
		
		
	}

}
