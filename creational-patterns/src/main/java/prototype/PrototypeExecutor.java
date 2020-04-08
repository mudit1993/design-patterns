package prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeExecutor {

	public static void main(String[] args) {
		String sql= "select * from Person";
		List<String> names = new ArrayList<String>();
		names.add("Mudit");
		Record record = new Record();
		
		Statement statement = new Statement(sql, names, record);
		
		System.out.println(statement.getSql());
		System.out.println(statement.getParameters());
		System.out.println(statement.getRecord());
		
		Statement cloneStatement = statement.clone();

		System.out.println(cloneStatement.getSql());
		System.out.println(cloneStatement.getParameters());
		System.out.println(cloneStatement.getRecord());
		
		Registry registry = new Registry();
		Movie movie = (Movie)registry.createItem("Movie");
		movie.setTitle("Intersteller");
		
		System.out.println(movie);
		System.out.println(movie.getPrice());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		
		Movie anotherMovie = (Movie)registry.createItem("Movie");
		anotherMovie.setTitle("Game of Shadows");

		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getPrice());
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		
	}

}
