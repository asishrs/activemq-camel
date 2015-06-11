package org.yagna.samples.activemq;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer implements Processor {

	@Autowired
	private ProducerTemplate producer;
	
	@Autowired
	@Qualifier("testInEP")
	private Endpoint endpoint;

	public void setProducer(ProducerTemplate producer) {
		this.producer = producer;
	}

	public void process(Exchange ex) throws Exception {
		this.producer.sendBody(this.endpoint, "This is a test Message!!");
	}
}
