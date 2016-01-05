package mediatator;

/**
 * Explanation : 
 * @version : 2014. 2. 17.
 * @author : se
 * DesingPattern / package mediatator;
 */

public class UserImpl extends User {

	public UserImpl(ChatMeditator med, String name) {
		super(med, name);
		med.addUser(this);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}

}
