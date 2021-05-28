package run;

import pubsub.Message;
import pubsub.publisher.Publisher;
import pubsub.publisher.PublisherImpl;
import pubsub.service.PubSubService;
import pubsub.subscriber.Subscriber;
import pubsub.subscriber.SubscriberImpl;

public class Run {

	public static void main(String[] args) {
		// Instantiate publishers, subscribers and PubSubService
		Publisher javaPublisher = new PublisherImpl();
		Publisher pythonPublisher = new PublisherImpl();

		Subscriber javaSubscriber = new SubscriberImpl();
		Subscriber javaSubscriber2 = new SubscriberImpl();
		Subscriber allLanguagesSubscriber = new SubscriberImpl();
		Subscriber pythonSubscriber = new SubscriberImpl();

		PubSubService pubSubService = new PubSubService();

		// Declare Messages and Publish Messages to PubSubService
		Message javaMsg1 = new Message("Java", "Core Java Concepts");
		Message javaMsg2 = new Message("Java", "Spring MVC : Dependency Injection and AOP");
		Message javaMsg3 = new Message("Java", "JPA & Hibernate");

		javaPublisher.publish(javaMsg1, pubSubService);
		javaPublisher.publish(javaMsg2, pubSubService);
		javaPublisher.publish(javaMsg3, pubSubService);

		Message pythonMsg1 = new Message("Python", "Easy and Powerful programming language");
		Message pythonMsg2 = new Message("Python", "Advanced Python message");

		pythonPublisher.publish(pythonMsg1, pubSubService);
		pythonPublisher.publish(pythonMsg2, pubSubService);

		// Declare Subscribers
		javaSubscriber.addSubscriber("Java", pubSubService); // Java subscriber only subscribes to Java topics
		javaSubscriber2.addSubscriber("Java", pubSubService); // Java subscriber2 only subscribes to Java topics
		pythonSubscriber.addSubscriber("Python", pubSubService); // Python subscriber only subscribes to Python topics
		allLanguagesSubscriber.addSubscriber("Java", pubSubService); // all subscriber, subscribes to both Java and
																		// Python
		allLanguagesSubscriber.addSubscriber("Python", pubSubService);

		// Trying unSubscribing a subscriber
//		 pythonSubscriber.unSubscribe("Python", pubSubService);

		// Broadcast message to all subscribers. After broadcast, messageQueue will be
		// empty in PubSubService
		pubSubService.broadcast();
		

		System.out.println("\nMessages of Java Subscriber are: ");
		javaSubscriber.printMessages();
		
		System.out.println("\nMessages of Java Subscriber'2' are: ");
		javaSubscriber2.printMessages();

		System.out.println("\nMessages of Python Subscriber are: ");
		pythonSubscriber.printMessages();

		System.out.println("\nMessages of All Languages Subscriber are: ");
		allLanguagesSubscriber.printMessages();

		// After broadcast the messagesQueue will be empty, so publishing new messages
		// to server
		System.out.println("\nPublishing 2 more Java Messages...");
		Message javaMsg4 = new Message("Java", "JSP and Servlets");
		Message javaMsg5 = new Message("Java", "Struts framework");

		javaPublisher.publish(javaMsg4, pubSubService);
		javaPublisher.publish(javaMsg5, pubSubService);

		//java Subscriber1 get message which Accumulated in queue and delete them
		javaSubscriber.getMessagesForSubscriberOfTopic("Java", pubSubService);
		System.out.println("\nMessages of Java Subscriber now are: ");
		javaSubscriber.printMessages();
		System.out.println("=============javaSubscriber2============");
		javaSubscriber2.printMessages();
		System.out.println("==============allLanguagesSubscriber===========");
		allLanguagesSubscriber.printMessages();

	}

}
