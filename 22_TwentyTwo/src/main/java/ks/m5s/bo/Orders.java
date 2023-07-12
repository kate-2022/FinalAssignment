package ks.m5s.bo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table (name= "orders")
@Data
@AllArgsConstructor
public class Orders {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	
	//private static int userId;
	private String itemName;
	private String companyName;
	private double itemNo;
	    
	    @OneToOne(cascade = CascadeType.ALL)
	    @MapsId
	    private User user;

	
	public Orders() {
		
		System.out.println("This is Zero-Arg constructor of Orders used..");
	}
	
}
