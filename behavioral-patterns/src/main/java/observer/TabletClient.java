package observer;

public class TabletClient extends Observer {

	public TabletClient(Subject subject) {
		this.subject = subject;
		subject.attachObserver(this);
	}

	public void addMessage(String message) {
		subject.setState(message + " - set from Tablet");
	}

	@Override
	protected void update() {
		System.out.println("Tablet stream : " + subject.getState());
	}


}
