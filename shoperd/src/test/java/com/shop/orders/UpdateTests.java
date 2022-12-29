package com.shop.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orders;
import com.shop.service.OrdersService;

@SpringBootTest
class UpdateTests {
	
	@Autowired
	OrdersService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		Orders obj = new Orders(1002, "KYH", "카카오페이", 70000, null);
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}