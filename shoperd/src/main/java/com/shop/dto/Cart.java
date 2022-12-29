package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cart {
	private int cartid;
	private String custid;
	private int itemid;
	private int cartcnt;
	
	private String custname;
	private String itemname;
	private int price;
	private String brand;
	
	
	public Cart(int cartid, int cartcnt) {
		super();
		this.cartid = cartid;
		this.cartcnt = cartcnt;
	}


	public Cart(int cartid, String custid, int itemid, int cartcnt) {
		super();
		this.cartid = cartid;
		this.custid = custid;
		this.itemid = itemid;
		this.cartcnt = cartcnt;
	}
	
	
}
