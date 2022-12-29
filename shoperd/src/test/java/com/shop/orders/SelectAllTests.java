package com.shop.orders;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orders;
import com.shop.service.OrdersService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	OrdersService service;
	
	@Test
	void contextLoads() {
		List<Orders> objs = null;
		try {
			objs=service.get();
			for(Orders o:objs) {
				System.out.println(o);
			}
			System.out.println("ok");
		}catch(Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}
	}

}

