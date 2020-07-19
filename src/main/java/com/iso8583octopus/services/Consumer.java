package com.iso8583octopus.services;

import java.io.IOException;

import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	private final Logger logger = LoggerFactory.getLogger(Consumer.class);
	private static final String TOPIC = "67";

	@KafkaListener(topics = TOPIC, groupId = "67")
	public void consume(String message) throws IOException {
		logger.info(String.format("Consumed message : %s", message));
	}

}
