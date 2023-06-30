package ks.m5s.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import ks.m5s.dao.ICourseMemberRepo;

@Entity
public class CourseMember  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	
	private String saddress;
	private Integer sage;
	private String sname;
	
	public CourseMember() {
		System.out.println("Internally Hibernate uses ZERO-Param constructor..");
	}
	
	
	public CourseMember(Integer sid, String saddress, Integer sage, String sname) {
		super();
		this.sid = sid;
		this.saddress = saddress;
		this.sage = sage;
		this.sname = sname;
	}


	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	}
