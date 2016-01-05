package mediatator;

import java.util.ArrayList;

/**
 * Explanation : 
 * @version : 2014. 2. 17.
 * @author : se
 * DesingPattern / package mediatator;
 */

public class ChatMeditatorImpl implements ChatMeditator {

	private ArrayList<User> users = new ArrayList<User>();
	
	@Override
	public void addUser(User user) {
		users.add(user);		
	}
	
	@Override
	public void sendMessage(String msg, User user) {
		
		for(User u : users) {
			if(!u.equals(user)) /* except himself */
				u.receive(msg); /* other users received message */
		}
	}
	
}
