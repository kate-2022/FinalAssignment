package ks.m5s.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
public class User {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int userId;

	private String lastName;
	private String firstName;
	private String address;
	

	public User() {
		
		System.out.println("Internally Hibernate uses Zero-param constructor");
	}
	
	

}
