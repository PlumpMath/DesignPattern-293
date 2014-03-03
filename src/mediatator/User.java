package mediatator;

/**
 * Explanation : 
 * @version : 2014. 2. 17.
 * @author : se
 * DesingPattern / package mediatator;
 */

public abstract class User {
	
	protected ChatMeditator mediator;
	protected String name;

	public User(ChatMeditator med, String name){
		this.mediator = med;
		this.name = name;
	}

	public abstract void send(String msg);
	public abstract void receive(String msg);
}
