package basic;

public class ClassAndObject {

	public void run() {
		System.out.println("Display method");
	}

	public void add() {
		System.out.println("Add method");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
//		add();
		
		// How to create an object ?
		// ClassAndObject - class name
		// obj - reference variable/object
		// new - keyword in java
		// ClassAndObject() - constructor
		// new ClassAndObject();  - object
		
		ClassAndObject obj = new ClassAndObject();
		obj.run();
		obj.eat();
		obj.add();
		
		
	}
	
	
	public void eat() {
		System.out.println("Eat method");
	}
}
