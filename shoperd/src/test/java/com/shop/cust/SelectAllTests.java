package com.shop.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		List<Cust> objs = null;
		try {
			objs=service.get();
			for(Cust c:objs) {
				System.out.println(c);
			}
			System.out.println("ok");
		}catch(Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}
	}

}
