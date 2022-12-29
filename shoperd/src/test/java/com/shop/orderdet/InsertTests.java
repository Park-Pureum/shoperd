package com.shop.orderdet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orderdet;
import com.shop.service.OrderdetService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	OrderdetService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		Orderdet ord = new Orderdet(0, 1000, 101, 2, "서울시", "입");
		try {
			service.register(ord);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}

