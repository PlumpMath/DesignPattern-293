package builder;

/**
 * Explanation : 
 * @version : 2014. 2. 16.
 * @author : se
 * DesingPattern / package builder;
 */

public class TestCase {

	public static void main(String[] args) {

		/* confuse param's location */
		new NutritionFacts(3,4,5,6,7,8);
				
		/* write a too much code to create a instance */
		NutritionFacts facts = new NutritionFacts();
		facts.setCalories(1);
		facts.setCarbohydrate(3);
		facts.setFat(3);
		facts.setServings(4);
		
		/* Builder pattern 
		 * increase readability
		 */
		new NutritionFacts.Builder(240, 80)
		.calories(12)
		.carbohydrate(235)
		.fat(23)
		.sodium(15);
				
	}

}
