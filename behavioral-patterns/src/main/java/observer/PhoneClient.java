package observer;

public class PhoneClient extends Observer {

	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.attachObserver(this);
	}

	public void addMessage(String message) {
		subject.setState(message + " - set from Phone");
	}

	@Override
	protected void update() {
		System.out.println("Phone stream : " + subject.getState());
	}

}
