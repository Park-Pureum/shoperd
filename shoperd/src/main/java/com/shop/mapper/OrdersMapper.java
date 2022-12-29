package com.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Orders;
import com.shop.frame.MyMapper;

@Repository
@Mapper
public interface OrdersMapper extends MyMapper<Integer, Orders>{
	
	
}
