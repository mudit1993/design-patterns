package command;

//concrete command
public class OnCommand implements Command {

	Light light;

	public OnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.toggle();
	}

}
