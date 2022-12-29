package com.shop.orderdet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orderdet;
import com.shop.service.OrderdetService;

@SpringBootTest
class SelectTests {
	
	@Autowired
	OrderdetService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		Orderdet obj = null;
		try {
			obj=service.get(10000);
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
