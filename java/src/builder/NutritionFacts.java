package builder;

/**
 * Explanation : 
 * @version : 2014. 2. 16.
 * @author : se
 * DesingPattern / package builder;
 */

public class NutritionFacts {
	
	private int servingSize;
	private int servings;
	private int calories ;
	private int fat;
	private int sodium;
	private int carbohydrate;

	/* Builder pattern */
	public NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	/* Telescoping pattern */
	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
	
	/**
	 * @author se
	 * construct a instance with no param dependency, increasing readability
	 */
	public static class Builder {
		
		/* required parameters */
		private final int servingSize;
		private final int servings;

		/* optional parameters - initialized to default values */
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val)
		{ calories = val; return this; }

		public Builder fat(int val)
		{ fat = val; return this; }

		public Builder carbohydrate(int val)
		{ carbohydrate = val; return this; }
		
		public Builder sodium(int val)
		{ sodium = val; return this; }

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	
	/* Java Bean pattern */
	public NutritionFacts() { }
	
	public int getServingSize() {
		return servingSize;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

}
