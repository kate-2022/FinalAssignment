package ks.m5s;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import ks.m5s.bo.Orders;
import ks.m5s.bo.User;
import ks.m5s.service.IOrderManagementService;
import ks.m5s.service.OrderManagementServiceImpl;

@SpringBootApplication
public class Application {
	
	static Orders order;
	static User user;


	public static void main(String[] args) {
		
		 	List<Orders> orders;
		 	ApplicationContext context= SpringApplication.run(Application.class, args);
		 
		 	IOrderManagementService service = context.getBean(IOrderManagementService.class);
	        orders = service.findAllOrders(user) ;
		 
		 
	        ((ConfigurableApplicationContext) service).close();
	
	}
	

}
