package builder;

public class SandwichBuilder {

	private final String bread;
	private final String dressing;
	private final String condiments;
	private final String meat;

	public static class Builder {
		private String bread;
		private String dressing;
		private String condiments;
		private String meat;

		public Builder() {

		}

		public SandwichBuilder build() { // creating the immutable object of SandwichBuilder
			return new SandwichBuilder(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}

	public SandwichBuilder(Builder builder) {
		this.bread = builder.bread;
		this.dressing = builder.dressing;
		this.condiments = builder.condiments;
		this.meat = builder.meat;
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
