package com.inti.formation.testService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.inti.formartion.service.CalculcatriceService;

public class CalculatriceServiceTest {
	@Test
	public void additionTest() {
		CalculcatriceService calService=new CalculcatriceService();
		int a=5;
		int b=4;
		int result=calService.addition(a, b);
		assertEquals(9, result);
	}

}
