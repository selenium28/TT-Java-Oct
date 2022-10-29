package string;

public class StringConcatination {

	public static void main(String[] args) {
		
		//  + operator - String Concatenation
		
		String name = "java";
		String sum = "add";
		
		int x = 100;
		int y = 200;
		
		System.out.println(x+y);  // 300
		System.out.println(x+sum); // 100add
		System.out.println(name+sum);  // javaadd
		System.out.println(x+y+sum);  // 300add
		System.out.println(x+sum+x+y);  // 100add100200
		System.out.println(x+name+x+(y+x));  // 100java100300
		System.out.println(y+x+sum+(x+y)+x+sum+y);  // 300add300100add200

	}

}
