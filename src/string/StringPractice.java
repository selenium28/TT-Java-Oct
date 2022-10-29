package string;

public class StringPractice {

	public static void main(String[] args) {
		
		// == --> address compairition / location
		// equals -> content comparision
		
		String str = "Pune";
		String str2 = "Pune";
		String str3 = new String("Pune");
		String str4 = new String("Pune");
		
		System.out.println(str==str2);
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		System.out.println(str3==str4);
	}

}
