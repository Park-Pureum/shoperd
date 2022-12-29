package com.shop.frame;

import java.util.List;

public interface MyService<K,V> { //서비스의 뼈대
	public void register(V v)throws Exception; //insert
	public void remove(K k)throws Exception; //delete
	public void modify(V v)throws Exception; //update
	
	public V get(K k)throws Exception; //select
	public List<V> get()throws Exception;
}
