package abst;

public abstract class Car {
	// Partial Abstraction, 0 to 100%
	// Hiding the implementation details and showing only functionality to the user is known as Abstraction

	// Non-Abstract method
	public void startCar() {
		System.out.println("Car -- StartCar method");
	}

	// No method body 
	public abstract void stopCar();
	public abstract void seatCar();

}
