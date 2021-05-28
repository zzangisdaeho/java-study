package pubsub.subscriber;
import pubsub.service.PubSubService;

public class SubscriberImpl extends Subscriber{
	
	// this를 통해 같은 Subscriber 중 어떤 놈인지를 전달한다.
	
	//Add subscriber with PubSubService for a topic
	public void addSubscriber(String topic, PubSubService pubSubService){
		pubSubService.addSubscriber(topic, this);
	}
	
	//Unsubscribe subscriber with PubSubService for a topic
	public void unSubscribe(String topic, PubSubService pubSubService){
		pubSubService.removeSubscriber(topic, this);
	}

	//Request specifically for messages related to topic from PubSubService
	public void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService) {
		pubSubService.getMessagesForSubscriberOfTopic(topic, this);
		
	}	
}