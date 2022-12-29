package com.shop.orderdet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.OrderdetService;

@SpringBootTest
class DeleteTests {

	@Autowired
	OrderdetService service;
	
	@Test
	void contextLoads() {
		
		try {
			service.remove(10000);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
