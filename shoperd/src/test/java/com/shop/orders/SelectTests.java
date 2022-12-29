package com.shop.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orders;
import com.shop.service.OrdersService;

@SpringBootTest
class SelectTests {
	
	@Autowired
	OrdersService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		Orders obj = null;
		try {
			obj=service.get(1000);
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
