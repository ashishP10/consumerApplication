package com.java.app.consumerApplication.consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.java.app.consumerApplication.model.SystemMessage;


@Component
public class MessageConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);
	
	@JmsListener(destination = "activeMq-queue")
	public void messageListener(SystemMessage message) {
		LOGGER.info("Message received. {}", message);
	}
}