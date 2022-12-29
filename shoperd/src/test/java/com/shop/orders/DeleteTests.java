package com.shop.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.OrdersService;

@SpringBootTest
class DeleteTests {
	
	@Autowired
	OrdersService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		
		try {
			service.remove(1004);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
