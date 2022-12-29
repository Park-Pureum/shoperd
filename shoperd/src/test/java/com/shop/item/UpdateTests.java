package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class UpdateTests {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item item = new Item(100, "가죽가방1",80000,"PRADA");
		try {
			service.modify(item);
			System.out.println("OK");
		}catch(Exception e){
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
