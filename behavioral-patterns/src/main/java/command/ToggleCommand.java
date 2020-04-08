package command;

import java.util.List;

public class ToggleCommand implements Command {

	List<Light> lights;

	public ToggleCommand(List<Light> lights) {
		this.lights = lights;
	}

	public void execute() {
		lights.stream().filter(light -> light.isOn()).forEach(light -> light.toggle());
	}

}
