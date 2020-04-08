package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	List<Observer> observers = new ArrayList<Observer>();

	public abstract void setState(String state);

	public abstract String getState();

	public void attachObserver(Observer observer) {
		observers.add(observer);
	}

	public void detachObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
