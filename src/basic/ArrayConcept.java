package basic;

public class ArrayConcept {

	public static void main(String[] args) {
		// Array: To store similar Datatypes in array variable
		// Array index starting from zero
		// size n: n-1, ex: 4 ==> 4-1 = 3 (n is a size of array) 
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 50;
//		i[4] = 60;   // Exception: ArrayIndexOutOfBoundsException
		
		System.out.println(i[2]);  
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		double d[] = new double[5];
		
	}

}
