package org.yagna.samples.activemq;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="timerProcessor")
public class TimerMessageProcessor implements Processor {
	
	private Logger log = LoggerFactory.getLogger(TimerMessageProcessor.class); 

	@Autowired
	private ProducerTemplate producer;
	
	public void process(Exchange ex) throws Exception {
		log.info("Message Received is '{}'", ex.getIn().getBody());
	}
}
