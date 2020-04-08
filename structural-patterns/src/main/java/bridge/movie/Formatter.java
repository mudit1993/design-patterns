package bridge.movie;

import java.util.List;

public interface Formatter {

	public String format(String header, List<Detail> details); // passinf the details of the movie content to be formatted
	
}
