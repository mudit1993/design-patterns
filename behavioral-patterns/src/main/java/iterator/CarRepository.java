package iterator;

import java.util.Iterator;

public class CarRepository implements Iterable<String> {

	private String[] cars;
	private int index;

	public CarRepository() {
		cars = new String[10];
		index = 0;
	}

	public void addCar(String car) {
		if (index == cars.length) {
			String[] largerCars = new String[cars.length + 5];
			System.arraycopy(cars, 0, largerCars, 0, cars.length);
			cars = largerCars;
			largerCars = null;
		}
		cars[index++] = car;
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> iterator = new Iterator<String>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < cars.length && cars[currentIndex] != null;
			}

			@Override
			public String next() {
				return cars[currentIndex++];
			}
		};
		return iterator;
	}

}
