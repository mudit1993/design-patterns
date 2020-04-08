package builder;

public class LunchOrderDemo {

	private String bread;
	private String dressing;
	private String condiments;
	private String meat;

	public LunchOrderDemo(String bread) {
		this.bread = bread;
	}

	public LunchOrderDemo(String bread, String dressing) {
		this(bread);
		this.dressing = dressing;
	}

	public LunchOrderDemo(String bread, String dressing, String condiments) {
		this(bread, dressing);
		this.condiments = condiments;
	}

	public LunchOrderDemo(String bread, String dressing, String condiments, String meat) {
		this(bread, dressing, condiments);
		this.meat = meat;
	}

	public String getBread() {
		return bread;
	}

	public String getDressing() {
		return dressing;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getMeat() {
		return meat;
	}

}
