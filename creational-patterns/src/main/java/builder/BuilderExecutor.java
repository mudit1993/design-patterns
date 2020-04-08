package builder;

public class BuilderExecutor {

	public static void main(String[] args) {
		LunchOrderDemo lunchOrderDemo = new LunchOrderDemo("Wheat", "Lettuce", "Mustard", "Ham");

		System.out.println(lunchOrderDemo.getBread());
		System.out.println(lunchOrderDemo.getDressing());
		System.out.println(lunchOrderDemo.getCondiments());
		System.out.println(lunchOrderDemo.getMeat());

		
		SandwichBuilder.Builder builder = new SandwichBuilder.Builder();
		SandwichBuilder sandwichBuilder = builder.bread("Wheat").dressing("Lettuce").meat("Turkey")
				.build();

		System.out.println(sandwichBuilder.getBread());
		System.out.println(sandwichBuilder.getDressing());
		System.out.println(sandwichBuilder.getCondiments());
		System.out.println(sandwichBuilder.getMeat());

	}

}
