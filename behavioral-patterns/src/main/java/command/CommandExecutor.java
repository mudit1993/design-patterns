package command;

import java.util.ArrayList;
import java.util.List;

//client
public class CommandExecutor {

	public static void main(String[] args) {
		Light kitchenLight = new Light();
		Light bedroomLight = new Light();
		Switch switchAll = new Switch();

		Command toggleCommand = new OnCommand(kitchenLight);
		switchAll.storeAndExecute(toggleCommand); // light on
		toggleCommand = new OnCommand(bedroomLight);
		switchAll.storeAndExecute(toggleCommand); // light 2 on
		List<Light> lights = new ArrayList<Light>();
		lights.add(kitchenLight);
		lights.add(bedroomLight);
		switchAll.storeAndExecute(new ToggleCommand(lights)); // switching all lights off if any is on

	}

}
