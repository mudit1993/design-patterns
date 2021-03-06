package state;

public class FanLowState extends State {
	private Fan fan;

	public FanLowState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Fan is turned to Med state");
		fan.setState(fan.getFanMedState()); // transition to next state
	}

	public String toString() {
		return "Fan is Low";
	}
}
