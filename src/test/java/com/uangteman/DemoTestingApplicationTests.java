package com.uangteman;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.uangteman.service.HitungService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTestingApplicationTests {

	@Autowired private HitungService hitungService;
	
	@Test
	public void contextLoads() {
		Assert.assertEquals(20, hitungService.add(10, 10));
	}

}
