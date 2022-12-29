package com.shop.mapper;

	import org.apache.ibatis.annotations.Mapper;
	import org.springframework.stereotype.Repository;

	import com.shop.dto.Orderdet;
	import com.shop.frame.MyMapper;

	@Repository
	@Mapper
	public interface OrderdetMapper extends MyMapper<Integer, Orderdet> {

	}


