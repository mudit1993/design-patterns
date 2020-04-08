package mediator;

public class TurnAllOnCommand implements Command {

	private Mediator mediator;

	public TurnAllOnCommand(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOnAllLights();

	}

}
