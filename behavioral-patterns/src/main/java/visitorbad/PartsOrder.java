package visitorbad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

	private List<AtvPart> parts = new ArrayList<AtvPart>();

	public PartsOrder() {
		// TODO Auto-generated constructor stub
	}

	public void addPart(AtvPart part) {
		parts.add(part);
	}

	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}

	public double calculateShipping() {
		double shippingCost = 0;
		for (AtvPart part : parts) {
			shippingCost += part.calculateShipping();
		}
		return shippingCost;
	}

}
