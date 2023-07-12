package ks.m5s.dao;

import org.springframework.data.repository.CrudRepository;

import ks.m5s.bo.Orders;

public interface IOrderRepo extends CrudRepository<Orders, Integer>{
	
	

}
