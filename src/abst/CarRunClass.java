package abst;

public class CarRunClass {

	public static void main(String[] args) {
		// we can't create object of Abstract class.
//		Car objCar = new Car();
		
		TataCar objTataCar = new TataCar();
		objTataCar.seatCar();
		objTataCar.startCar();
		objTataCar.stopCar();

	}

}
