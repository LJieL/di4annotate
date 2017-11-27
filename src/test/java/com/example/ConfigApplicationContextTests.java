package com.example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.FnService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {AppConfig.class})
public class ConfigApplicationContextTests {
	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private SampleBean sampleBean;
	@Autowired
	private FnService fnService;
	
	@Test
	public void say() {
		System.out.println("Hi");
		assertNotNull(applicationContext);
	}
	@Test
	public void testFn() {
		assertEquals(3, fnService.add(1, 2));
	}

}
