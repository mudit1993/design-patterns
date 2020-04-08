package state;

public class FanHighState extends State {
	
	private Fan fan;
	
	public FanHighState(Fan fan) {
		this.fan = fan;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Fan is turned to OFF state");
		fan.setState(fan.getFanOffState());
	}
	
	public String toString() {
		return "Fan is high";
	}
	
}
