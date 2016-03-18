package me.tedzhang.demo.designpattern.behavioral.mediator;

/**
 * Allows loose coupling by encapsulating the way disparate sets of objects
 * interact and communicate with each other. Allows for the actions of each
 * object set to vary independently of one another.
 * 
 * @author skuld1012
 *
 */
public class MediatorPatternMain {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All");
	}
}
