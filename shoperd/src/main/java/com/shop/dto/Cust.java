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
public class Cust {
	private String custid;
	private String pwd;
	private String name;
	private String tel;
	private String gender;
	private int zipcode;
	private String addr;
	
	
	public Cust(String custid, String pwd, String name, String tel) {
		super();
		this.custid = custid;
		this.pwd = pwd;
		this.name = name;
		this.tel = tel;
	}
	
	
}
