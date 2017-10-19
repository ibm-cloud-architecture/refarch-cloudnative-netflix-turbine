package com.ibm.microservices.refapp.turbine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//The commented line below come from the RESILIENCY branch for Spring RabbitMQ.
//@SpringBootTest( properties = { "spring.cloud.discovery.enabled:false" } )
public class TurbineServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
