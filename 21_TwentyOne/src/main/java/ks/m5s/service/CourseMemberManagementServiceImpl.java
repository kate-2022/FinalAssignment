package ks.m5s.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ks.m5s.bo.CourseMember;
import ks.m5s.dao.ICourseMemberRepo;

@Service("service")
public class CourseMemberManagementServiceImpl implements ICourseMemberManagementService{
	
	@Autowired
	ICourseMemberRepo repo;

	@Override
	public String registerNewMember(CourseMember newMember) {
		CourseMember member = null;
		member = repo.save(newMember);
		return member!=null?"New student registered successfully with " + member.getSid():"Student not registered" ;
	}
	
	}






	
	
	

