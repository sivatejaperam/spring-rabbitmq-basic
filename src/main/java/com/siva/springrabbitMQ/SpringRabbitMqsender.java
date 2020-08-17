package com.siva.springrabbitMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringRabbitMqsender {

	private final static String SENDER_XML = "springamqp-rabbit-sender-context.xml";

	public static void main(String[] args) throws Exception {
		AmqpTemplate amqpTemplate = (AmqpTemplate) (new ClassPathXmlApplicationContext(SENDER_XML))
				.getBean("amqpTemplate");
		int messagCount = 0;
		while (messagCount < 10) {
			amqpTemplate.convertAndSend("tp.routingkey.1", "Message # " + messagCount++);
		}
		System.out.println(messagCount + " message(s) sent successfully.");
	}

}
