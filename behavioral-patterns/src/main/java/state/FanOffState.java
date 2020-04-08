package state;

public class FanOffState extends State {
	private Fan fan;

	public FanOffState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Fan is turned to Low state");
		fan.setState(fan.getFanLowState());
	}

	public String toString() {
		return "Fan is Off";
	}
}
