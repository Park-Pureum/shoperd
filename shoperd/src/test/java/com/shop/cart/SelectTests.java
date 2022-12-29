package com.shop.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
class SelectTests {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		Cart obj=null;
		try {
			obj=service.get(1);
			System.out.println(obj);
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("fail");
			e.getStackTrace();
		}
		
	}

}
