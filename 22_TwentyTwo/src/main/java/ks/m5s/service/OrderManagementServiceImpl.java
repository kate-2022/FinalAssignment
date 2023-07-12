package ks.m5s.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ks.m5s.bo.Orders;
import ks.m5s.bo.User;
import ks.m5s.dao.IOrderRepo;

public class OrderManagementServiceImpl implements IOrderManagementService {
	
	@Autowired
	IOrderRepo repo;
	
	@Override
	public List<Orders> findAllOrders(User user) {
		List <Orders> ordersByUser = (List<Orders>) repo.findAll();

		for (Orders elem : ordersByUser)
			System.out.println(elem);
		return ordersByUser;
	}

	

}
