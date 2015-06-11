package org.yagna.samples.activemq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/application-context.xml", "/camel-context.xml" })
public class MessageProducerTest {
	@Autowired
	private MessageProducer producer;

	@Test
	public void test() throws Exception {
		producer.process(null);
		Thread.sleep(10000);
	}

}
