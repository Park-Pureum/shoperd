package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Orders;
import com.shop.frame.MyService;
import com.shop.mapper.OrdersMapper;

@Service
public class OrdersService implements MyService<Integer, Orders>{
	
	@Autowired
	OrdersMapper mapper;
	
	@Autowired
	OrdersMapper ordersmapper;
	
	@Override
	public void register(Orders v) throws Exception{
		mapper.insert(v);
	}
	
	@Override
	public void remove(Integer k) throws Exception{
		mapper.delete(k);
	}
	
	@Override
	public void modify(Orders v) throws Exception{
		mapper.update(v);
	}
	
	@Override
	public Orders get(Integer k) throws Exception{
		return mapper.select(k);
	}
	
	@Override
	public List<Orders> get() throws Exception{
		return mapper.selectall();
	}

}
