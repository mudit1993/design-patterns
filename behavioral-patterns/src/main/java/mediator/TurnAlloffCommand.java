package mediator;

public class TurnAlloffCommand implements Command {

	private Mediator mediator;

	public TurnAlloffCommand(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOffAllLights();

	}

}
