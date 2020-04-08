package mediator;

//receiver
public class Light {

	private boolean isOn = false;
	
	private String location;
	
		public Light(String location) {
		super();
		this.location = location;
	}

	public boolean isOn() {
		return isOn;
	}

	public void toggle() {
		if (isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}

	private void on() {
		System.out.println(location + " Light switched ON");
	}

	private void off() {
		System.out.println(location + " Light switched OFF");
	}
}
