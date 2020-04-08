package bridge.movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

	private Movie movie;

	public MoviePrinter(Movie movie) {
		this.movie = movie;
	}

	@Override
	protected String getHeaders() {
		return movie.getClassification();
	}

	@Override
	protected List<Detail> getDetails() {
		List<Detail> details = new ArrayList<Detail>();
		
		details.add(new Detail("runtime", movie.getRuntime()));
		details.add(new Detail("title", movie.getTitle()));
		details.add(new Detail("year", movie.getYear()));

		return details;
	}

}
