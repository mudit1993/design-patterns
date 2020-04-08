package bridge.movie;

import java.util.List;

public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(getHeaders(), getDetails()); // using the interface and can have different print formats
																// like html5 etc based on the implementation
	}

	protected abstract String getHeaders();

	protected abstract List<Detail> getDetails();

}
