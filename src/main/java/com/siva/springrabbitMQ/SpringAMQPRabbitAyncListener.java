package com.siva.springrabbitMQ;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class SpringAMQPRabbitAyncListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		System.out.println("Listener received message = " + new String(message.getBody()));

	}

}
