package com.shop.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() { //실행되는 영역
		Cust obj = new Cust("id01", "1234", "춘식이", "010-1111-1111","M", 12345,"서울시 강남구");
		try {
			service.register(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
