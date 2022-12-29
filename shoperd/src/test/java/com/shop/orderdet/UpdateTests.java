package com.shop.orderdet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Orderdet;
import com.shop.service.OrderdetService;

@SpringBootTest
class UpdateTests {
	
	@Autowired
	OrderdetService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		Orderdet obj = new Orderdet(1000, 3, "서울시","배송완료");
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}

