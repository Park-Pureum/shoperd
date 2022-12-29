package com.shop.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orders;
import com.shop.service.OrdersService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	OrdersService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		Orders obj = new Orders(1003, "JJE", "카카오페이", 60000, null);
		try {
			service.register(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}