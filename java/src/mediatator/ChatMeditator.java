package mediatator;

/**
 * Explanation : 
 * @version : 2014. 2. 17.
 * @author : se
 * DesingPattern / package mediatator;
 */

public interface ChatMeditator {
	void sendMessage(String msg, User user);
	void addUser(User user);
}
