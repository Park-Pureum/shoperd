package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Orderdet;
import com.shop.frame.MyService;
import com.shop.mapper.OrderdetMapper;

@Service
public class OrderdetService implements MyService<Integer, Orderdet>{

	@Autowired
	OrderdetMapper mapper;
	
	@Override
	public void register(Orderdet v) throws Exception {
		mapper.insert(v);
	}
	
	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}
	
	@Override
	public void modify(Orderdet v) throws Exception {
		mapper.update(v);
	}
	
	@Override
	public Orderdet get(Integer k) throws Exception {
		
		return mapper.select(k);
	}
	
	@Override
	public List<Orderdet> get() throws Exception {
		
		return mapper.selectall();
	}
}
