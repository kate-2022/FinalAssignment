package ks.m5s.service;

import java.util.List;
import ks.m5s.bo.Orders;
import ks.m5s.bo.User;


public interface IOrderManagementService {
	
	public List<Orders> findAllOrders(User user);

}
