package bridge.movie;

public class BridgeMovieExecutor {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setRuntime("2:30");
		movie.setTitle("Spider Man");
		movie.setYear("2005");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		String print = moviePrinter.print(printFormatter);
		
		printFormatter= new HtmlFormatter();
		
		System.out.println(print);
		print = moviePrinter.print(printFormatter);
		System.out.println(print);
		
	}
}
