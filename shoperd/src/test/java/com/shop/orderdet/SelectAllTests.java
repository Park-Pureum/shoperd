package com.shop.orderdet;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orderdet;
import com.shop.service.OrderdetService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	OrderdetService service;
	
	@Test
	void contextLoads() {
		List<Orderdet> objs = null;
		try {
			objs=service.get();
			for(Orderdet c:objs) {
				System.out.println(c);
			}
			System.out.println("ok");
		}catch(Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}
	}

}
