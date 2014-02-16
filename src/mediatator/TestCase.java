package mediatator;

/**
 * Explanation : 
 * @version : 2014. 2. 17.
 * @author : se
 * DesingPattern / package mediatator;
 */

public class TestCase {
	
	public static void main(String[] args) {
		
		/* create a meditator object */
		ChatMeditator mediator = new ChatMeditatorImpl();
		
		/* create a user in meditator object & add user */
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");

		/* send message to other users except himself */
		user1.send("Hi All");
	}
}
