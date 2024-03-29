package mediator;

public class MediatorExecutor {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();

		Light kitchenLight = new Light("Kitchen");
		Light bedroomLight = new Light("Bedroom");

		mediator.registerLight(kitchenLight);
		mediator.registerLight(bedroomLight);

		Command command = new TurnAllOnCommand(mediator);
		command.execute();
		
		command = new TurnAlloffCommand(mediator);
		command.execute();

	}

}
