package inheri;

public class RunClass {

	public static void main(String[] args) {
		
		// Inheritance -->It is inheriting the properties of parent class into child class is known as Inheritance.
		// MethodOverloading --> When same method is present in parent class as well as in child class with same 
		// no of parameters is known as Method Overloading
		
		BikeClass objBikeClass = new BikeClass();
		objBikeClass.cbz();
		objBikeClass.heroHonda();
		objBikeClass.honda();
		objBikeClass.indica();
		objBikeClass.nexon();
//		objBikeClass.mahindra();
		
		CarClass objCarClass = new CarClass();
		objCarClass.mahindra();
	}

}
