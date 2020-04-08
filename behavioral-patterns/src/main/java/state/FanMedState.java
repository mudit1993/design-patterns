package state;

public class FanMedState extends State {
	private Fan fan;

	public FanMedState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Fan is turned to High state");
		fan.setState(fan.getFanHighState());
	}

	public String toString() {
		return "Fan is Medium";
	}
}
