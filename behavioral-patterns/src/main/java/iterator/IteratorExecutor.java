package iterator;

public class IteratorExecutor {

	public static void main(String[] args) {

		CarRepository carsRepo = new CarRepository();
		carsRepo.addCar("Ferrari");
		carsRepo.addCar("Mercedes");
		carsRepo.addCar("Porshe");

//		Iterator<String> cars = carsRepo.iterator();
//
//		while (cars.hasNext()) {
//			System.out.println(cars.next());
//		}

		for (String car : carsRepo) {
			System.out.println(car);
		}

	}

}
