package com.shop.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@SpringBootTest
class UpdateTests {
	
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		Cust obj = new Cust("id01", "pwd012", "춘식이", "010-1234-1234");
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
