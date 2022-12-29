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

public class Orderdet {
	private int orderdetid;
	private int orderid;
	private int itemid;
	private int ordercnt;
	private String deladdr;
	

	private String status;


	public Orderdet(int orderdetid, int ordercnt, String deladdr, String status) {
		super();
		this.orderdetid = orderdetid;
		this.ordercnt = ordercnt;
		this.deladdr = deladdr;
		this.status = status;
		
		
		
	}


	





}
