package singleton;

public class SingletonStatic {

	private static volatile SingletonStatic instance = null; // using volatile to read from the main memory directly

	private SingletonStatic() { // to restrict the object creation via Reflections
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}

	}

	public static SingletonStatic getInstance() {
		if (instance == null) {
			synchronized (SingletonStatic.class) { // synchronize not at a method level to avoid performance hit on
													// every call to getInstance()
				if (instance == null) {
					instance = new SingletonStatic();
				}
			}
		}
		return instance;
	}
}
