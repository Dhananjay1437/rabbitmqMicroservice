package com.javaguide.emailservice.consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.javaguide.emailservice.dto.OrderEvent;
@Component
public class OrderConsumer {
	 private Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);
 
	    @RabbitListener(queues = "${rabbitmq.queue.email.name}")
	    public void consume(OrderEvent event){
	        LOGGER.info(String.format("Order event received => %s", event.toString()));

	        // save order event data in database
	    }
}
