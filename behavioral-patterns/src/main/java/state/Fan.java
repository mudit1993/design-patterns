package state;

public class Fan {

	FanOffState fanOffState;
	FanLowState fanLowState;
	FanMedState fanMedState;
	FanHighState fanHighState;

	State state;

	public Fan() {
		fanOffState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanMedState = new FanMedState(this);
		fanHighState = new FanHighState(this);

		state = fanOffState;
	}

	public void pullChain() {
		state.handleRequest();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getFanOffState() {
		return fanOffState;
	}

	public State getFanMedState() {
		return fanMedState;
	}

	public State getFanLowState() {
		return fanLowState;
	}

	public State getFanHighState() {
		return fanHighState;
	}
	
	public String toString() {
		return state.toString();
	}

}
