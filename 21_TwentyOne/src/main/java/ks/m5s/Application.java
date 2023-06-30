package ks.m5s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import ks.m5s.bo.CourseMember;
import ks.m5s.service.ICourseMemberManagementService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ApplicationContext context= SpringApplication.run(Application.class, args);
		 
		 ICourseMemberManagementService service = context.getBean(ICourseMemberManagementService.class);
	
		 CourseMember member = new CourseMember(19, "MUC", 22, "Alphonso Davies");
		 System.out.println(service.registerNewMember(member));
		 
		 ((ConfigurableApplicationContext) service).close();
	
	}
	

}
